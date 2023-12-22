import static java.lang.String.valueOf;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        while (judgeInData())
            exeUOC();
    }

    private void exeUOC() {
        char[] inDataList = getInData().toCharArray();
        String outStr = valueOf(inDataList);
        while (judgeBreak(outStr)) {
            outStr = valueOf(editList(inDataList));
        }
        out.println(outStr);
    }

    private boolean judgeBreak(String out) {
        return !Pattern.compile("the|this|that").matcher(out).find();
    }

    private char[] editList(char[] dataes) {
        for (int index = 0; index < dataes.length - 1; index++) {
            if (dataes[index] == ' ')
                continue;
            dataes[index] = (dataes[index] + 1 == 'z') ? 'a' : ++dataes[index];
        }
        return dataes;
    }
}

abstract class BaseExe {

    private Scanner scan;

    private String inData;

    public void exeSysIn() {
        try (Scanner scan = new Scanner(System.in)) {
            exeCtrl(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exeFileIn(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            exeCtrl(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void exeCtrl(Scanner scan) {
        this.scan = scan;
        execute();
    }

    protected abstract void execute();

    protected String nextLine() {
        return scan.nextLine();
    }

    protected boolean judgeInData() {
        return hasNextLine() && isNotEmptyInData();
    }

    protected boolean hasNextLine() {
        return scan.hasNextLine();
    }

    protected boolean isNotEmptyInData() {
        return !"".equals(inData = nextLine());
    }

    protected String getInData() {
        return inData;
    }

}