import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    private char[] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        Map<Character, Integer> indexMap = getIndexMap();
        char[] inDataList = nextLine().toCharArray();
        String out = getStr(inDataList);
        while (judgeBreak(out)) {
            out = getStr(editList(inDataList, indexMap));
        }
        System.out.println(out);
    }

    private Map<Character, Integer> getIndexMap() {
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < alp.length; index++)
            indexMap.put(alp[index], index);
        return indexMap;
    }

    private boolean judgeBreak(String out) {
        return (!out.contains("the") && !out.contains("this") && !out.contains("that"));
    }

    private char[] editList(char[] inDataList, Map<Character, Integer> indexMap) {
        for (int index = 0; index < inDataList.length - 1; index++) {
            if (inDataList[index] == ' ')
                continue;
            inDataList[index] = edit(inDataList[index], indexMap);
        }
        return inDataList;
    }

    private char edit(char item, Map<Character, Integer> indexMap) {
        return (item == 'z') ? alp[0] : alp[indexMap.get(item) + 1];
    }

    private String getStr(char[] inDataList) {
        return new String(inDataList);
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