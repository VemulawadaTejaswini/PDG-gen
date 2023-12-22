import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (;;) {
            String line = br.readLine();
            String[] ss = line.split(" ");
            int[] scs = new int[3];
            for (int ii = 0; ii < 3; ii++) {
                scs[ii] = Integer.parseInt(ss[ii]);
            }
            if (scs[0] == -1 && scs[1] == -1 && scs[2] == -1) {
                break;
            }
            if (scs[0] == -1 || scs[1] == -1) {
                System.out.println("F");
                continue;
            }
            int total = scs[0] + scs[1];
            if (80 <= total) {
                System.out.println("A");
                continue;
            }
            if (65 <= total) {
                System.out.println("B");
                continue;
            }
            if (50 <= total) {
                System.out.println("C");
                continue;
            }
            if (30 <= total) {
                if (50 <= scs[2]) {
                    System.out.println("C");
                    continue;
                }
                System.out.println("D");
                continue;
            }
            System.out.println("F");
        }
    }
}