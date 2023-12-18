import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] cntArray = new int[s.length()];
        int[] pre1CntArray = new int[s.length()];
        int[] pre2CntArray = new int[s.length()];

        Arrays.fill(cntArray, 1);

        //printCntArray(cntArray);

        int matchCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            pre2CntArray = pre1CntArray.clone();
            pre1CntArray = cntArray.clone();
            movePosition(s, cntArray, pre1CntArray);
            //printCntArray(cntArray);

            if (Arrays.equals(pre1CntArray, cntArray)) {
                printCntArray(cntArray);
                break;
            }

            if (Arrays.equals(pre2CntArray, cntArray)) {
                if ((i + 1) % 2 == 0) {
                    printCntArray(cntArray);
                } else {
                    printCntArray(pre1CntArray);
                }
                break;
            }
        }
    }

    public static void movePosition(String s, int[] cntArray, int[] prevCntArray) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                cntArray[i + 1] += prevCntArray[i];
                cntArray[i] -= prevCntArray[i];
            } else {
                cntArray[i - 1] += prevCntArray[i];
                cntArray[i] -= prevCntArray[i];
            }
        }
    }

    public static void printCntArray(int[] cntArray) {

        //System.out.print("debug:");
        for (int cnt : cntArray) {
            System.out.print(cnt);
            //System.out.print(" ");
        }
        //System.out.print("\n");
    }
}
