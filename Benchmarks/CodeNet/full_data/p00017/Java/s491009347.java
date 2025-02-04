import static java.lang.String.valueOf;
import static java.lang.System.out;
import static java.util.regex.Pattern.compile;
import java.io.File;
import java.util.Scanner;

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
        char[] dataes = getInData().toCharArray();
        String outStr = valueOf(dataes);
        while (!judgeBreak(outStr))
            outStr = valueOf(editList(dataes));
    }

    private boolean judgeBreak(String outStr) {
        if (compile("the|this|that").matcher(outStr).find()) {
            out.println(outStr);
            return true;
        }
        return false;
    }

    private char[] editList(char[] dataes) {
        for (int index = 0; index < dataes.length - 1; index++) {
            if (dataes[index] == ' ')
                continue;
            dataes[index] = (++dataes[index] == 'z') ? 'a' : dataes[index];
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