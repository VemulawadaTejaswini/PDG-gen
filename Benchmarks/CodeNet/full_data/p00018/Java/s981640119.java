import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static java.util.Collections.reverse;
import static java.util.Collections.sort;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import junit.framework.TestCase;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        List<Integer> list = revSortList();
        for (int index = 0; index < list.size(); index++)
            printItem(index, list);
    }

    private List<Integer> getList() {
        String[] inDataes = nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 5; index++)
            list.add(parseInt(inDataes[index]));
        return list;
    }

    private List<Integer> revSortList() {
        List<Integer> list = getList();
        sort(list);
        reverse(list);
        return list;
    }

    private void printItem(int index, List<Integer> list) {
        if (index == list.size() - 1)
            out.println(list.get(index));
        else
            out.print(list.get(index) + " ");
    }
}

abstract class BaseExe extends TestCase {

    /** ????????£?????? */
    private Scanner scan;

    /** ??\???????????? */
    private String inData;

    /** ?????????????????\????????? */
    public void exeSysIn() {
        try (Scanner scan = new Scanner(System.in)) {
            exeCtrl(scan);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /** ??????????????\????????? */
    public void exeFileIn(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            exeCtrl(scan);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /** ??????????????????????????? */
    private void exeCtrl(Scanner scan) throws Exception {
        this.scan = scan;
        execute();
    }

    /** ????????? */
    protected abstract void execute() throws Exception;

    /** ?¬?????????? */
    protected String nextLine() {
        return scan.nextLine();
    }

    /** ??\????????? */
    protected boolean judgeInData() {
        return hasNextLine() && isNotEmptyInData();
    }

    /** ?¬?????????¨?????? */
    protected boolean hasNextLine() {
        return scan.hasNextLine();
    }

    /** ??????????????? */
    protected boolean isNotEmptyInData() {
        inData = nextLine();
        return !inData.isEmpty();
    }

    /** ??\?????????????????? */
    protected String getInData() throws Exception {
        if (inData.isEmpty())
            throw new Exception("inData is Empty.");
        return inData;
    }
}