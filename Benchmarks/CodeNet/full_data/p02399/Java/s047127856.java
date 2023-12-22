import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static java.lang.System.out;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() throws Exception {
        List<Integer> ab = asList(nextLine().split(" ")).stream().map(Integer::parseInt)
                .collect(toList());
        out.printf("%d %d %.5f", getDiv(ab), getMod(ab), getDivDouble(ab));
    }

    private int getDiv(List<Integer> ab) {
        return ab.get(0) / ab.get(1);
    }

    private int getMod(List<Integer> ab) {
        return ab.get(0) % ab.get(1);
    }

    private double getDivDouble(List<Integer> ab) {
        return (double) ab.get(0) / (double) ab.get(1);
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

    private void exeCtrl(Scanner scan) throws Exception {
        this.scan = scan;
        execute();
    }

    protected abstract void execute() throws Exception;

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
        inData = nextLine();
        return !inData.isEmpty();
    }

    protected String getInData() throws Exception {
        if (inData.isEmpty())
            throw new Exception("inData is Empty.");
        return inData;
    }
}