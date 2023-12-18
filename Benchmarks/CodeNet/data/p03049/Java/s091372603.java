
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";
        int countAB = 0;
        int FinishedA = 0;
        int startB = 0;
        int startBFinishA = 0;

        for (int i = 0; i < N; i++) {
            str = sc.next();

            countAB += count(str);

            if (str.charAt(0) == 'B' && str.charAt(str.length() - 1) == 'A') {
                startBFinishA++;
            } else if (str.charAt(0) == 'B') {
                startB++;
            } else if (str.charAt(str.length() - 1) == 'A') {
                FinishedA++;
            }
        }

        if (startB > 0 && FinishedA > 0) {
            countAB += (startB >= FinishedA ? FinishedA : startB);
            countAB += startBFinishA;
        } else if (startB == 0 && FinishedA == 0) {
            countAB += (startBFinishA > 0 ? startBFinishA - 1 : startBFinishA);
        } else {
            countAB += (startBFinishA > 0 ? startBFinishA : 0);
        }
        System.out.println(countAB);
    }

    public static int count(String str) {
        int count = 0;
        for (int index = 0; (index = str.indexOf("AB", index)) != -1; index++) {
            count++;
        }
        return count;
    }
}
