import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        convOutput();
    }

    private static void convOutput() {
        Scanner sc = new Scanner(System.in);
        List<Long> listLong = new LinkedList<>();
        String[] sArrayStr = sc.next().split("");
        for (int i = 0; i < sArrayStr.length - 1; i++) {
            listLong.add(Long.parseLong(sArrayStr[i]));
        }
        String sResult = "";
        if (isNine(listLong)) {
            sResult = "Yes";
        } else {
            sResult = "No";
        }
        System.out.print(sResult);
    }

    private static boolean isNine(final List<Long> lArrayNum) {
        if (0 == getTotalNum(lArrayNum) % 9) {
            return true;
        } else if (0 == getLength(lArrayNum) % 9) {
            return true;
        } else {
            return false;
        }
    }

    private static int getTotalNum(final List<Long> lListNum) {
        int iTotalNum = 0;
        for (int i = 0; i < lListNum.size(); i++) {
            iTotalNum += lListNum.get(i);
        }
        return iTotalNum;
    }

    private static int getLength(final List<Long> lListNum) {
        return lListNum.size();
    }
}