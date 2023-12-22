import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[][] card = new int[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card[i][j] = j + 1;
            }
        }

        String[] piclist = {"S", "H", "C", "D"};
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            String picture = sc.next();
            int rank = Integer.parseInt(sc.next());
            int pic = 0;
            for (int j = 0; j < 4; j++) {
                if (picture.equals(piclist[j])) {
                    card[j][rank-1] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (card[i][j] != 0) {
                    out.printf("%s %d\n", piclist[i], card[i][j]);
                }
            }
        }
        out.flush();
    }
}
