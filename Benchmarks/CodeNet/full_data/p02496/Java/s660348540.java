import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

	
class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = 0;
        boolean[][] cards = new boolean[4][14];
        for (int i = 0;; i++) {
            if (i == n + 1) {
                break;
            }
            String str = br.readLine();
            if (i == 0) {
                n = Integer.parseInt(str);
                if (n == 0) {
                    break;
                }
                continue;
            }
            String[] ss = str.split(" ");
            String s = ss[0];
            int num = Integer.parseInt(ss[1]);
            if (s.equals("S")) {
                cards[0][num] = true;
            } else if (s.equals("H")) {
                cards[1][num] = true;
            } else if (s.equals("C")) {
                cards[2][num] = true;
            } else if (s.equals("D") == true) {
                cards[3][num] = true;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                if (cards[i][j]) {
                    continue;
                }
                String s = "";
                if (i == 0) {
                    s = "S";
                } else if (i == 1) {
                    s = "H";
                } else if (i == 2) {
                    s = "C";
                } else if (i == 3) {
                    s = "D";
                }
                System.out.println(s + " " + j);
            }
        }
    }
}	