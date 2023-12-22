import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kazuki on 2014/07/10.
 */
public class Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int tNum, hNum, tCalc, hCalc, calc;
        int[] t, h;
        int n = 0, m = 0;
        boolean flag;

        while (true) {
            tNum = s.nextInt();
            hNum = s.nextInt();

            if (tNum == 0 && hNum == 0) break;

            tCalc = 0;
            hCalc = 0;
            flag = false;
            t = new int[tNum];
            h = new int[hNum];

            for (int i = 0; i < tNum; i++) {
                t[i] = s.nextInt();
                tCalc += t[i];
            }
            for (int i = 0; i < hNum; i++) {
                h[i] = s.nextInt();
                hCalc += h[i];
            }

            Arrays.sort(t);
            Arrays.sort(h);

            calc = tCalc - hCalc;

            for (n = 0; n < tNum; n++) {
                for (m = 0; m < hNum; m++) {
                    if (calc == (t[n] - h[m])*2) {
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
            if (flag)
                System.out.println(t[n] + " " + h[m]);
            else
                System.out.println("-1");
        }

    }
}