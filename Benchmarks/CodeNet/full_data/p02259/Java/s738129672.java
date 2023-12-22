

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        boolean flag = true;

        StringBuffer buf = new StringBuffer();

        int n = in.nextInt();
        int[] raw = new int[n];

        for (int i = 0; i < n; i++) {
            raw[i] = in.nextInt();
        }
        int cnt = 0;

        while (flag) {

            flag = false;

            int init = n-1;
            for (int j = init; j >= 1; j--) {
                if (raw[j] < raw[j-1]) {
                    int tmp1 = raw[j];
                    int tmp2 = raw[j-1];
                    raw[j] = tmp2;
                    raw[j-1] = tmp1;
                    cnt++;
                    flag = true;
                }

            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(raw[k]);
            if (k != n -1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(cnt);

    }
}

