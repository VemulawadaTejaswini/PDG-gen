import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] cntArray = new int[s.length()];
        int[] pre1CntArray = new int[s.length()];
        int[] pre2CntArray = new int[s.length()];

        //Arrays.fill(cntArray, 1);

        //printCntArray(cntArray);

        sortCntArray(s, cntArray);

        for (int i = 0; i < s.length(); i++) {
            pre2CntArray = pre1CntArray.clone();
            pre1CntArray = cntArray.clone();
            movePosition(s, cntArray, pre1CntArray);

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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cntArray.length; i++) {
            sb.append(cntArray[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    public static void sortCntArray(String s, int[] cntArray) {

        char target = 0;
        int matchCnt = 0;
        for (int i = 0; i < s.length(); i += matchCnt) {
            target = s.charAt(i);
            matchCnt = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == target) {
                    matchCnt++;
                } else {
                    break;
                }
            }

            if (matchCnt == 1) {
                cntArray[i] = matchCnt;
            } else {
                if (target == 'R') {
                    cntArray[i + (matchCnt - 2)] = (matchCnt / 2);
                    cntArray[i + (matchCnt - 1)] = (matchCnt % 2 == 0) ? (matchCnt / 2) : (matchCnt / 2) + 1;
                } else {
                    cntArray[i + 1] = (matchCnt / 2);
                    cntArray[i] = (matchCnt % 2 == 0) ? (matchCnt / 2) : (matchCnt / 2) + 1;
                }
            }
        }
    }
}
