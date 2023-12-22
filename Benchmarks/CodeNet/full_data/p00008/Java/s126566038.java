import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        String inDataStr;
        int combi;
        for (int inputCount = 0; inputCount < 50; inputCount++) {
            if (!scan.hasNextLine() || "".equals(inDataStr = scan.nextLine())) {
                break;
            } else if (50 < parseInt(inDataStr) || parseInt(inDataStr) < 1) {
                break;
            }
            combi = getCombi(getSumTwo(), getSumTwo(), parseInt(inDataStr));
            out.println(combi);
        }
    }

    private int getCombi(int[] abList, int[] cdList, int inData) {
        int combi = 0;
        for (int ab : abList) {
            for (int cd : cdList) {
                combi = (judgeSum(ab, cd, inData)) ? combi + 2 : combi;
            }
        }
        return combi;
    }

    private boolean judgeSum(int ab, int cd, int inData) {
        return (ab == inData - cd) ? true : false;
    }

    private int[] getSumTwo() {
        Set<Integer> sumList = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                sumList.add(i + j);
            }
        }
        return setToArray(sumList);
    }

    private int[] setToArray(Set<Integer> sumList) {
        int abList[] = new int[19];
        int index = 0;
        for (int num : sumList) {
            abList[index++] = num;
        }
        return abList;
    }
}

abstract class BaseExe {

    public void exeSysIn() {
        try (Scanner scan = new Scanner(System.in)) {
            execute(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exeFileIn(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            execute(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract void execute(Scanner scan);
}