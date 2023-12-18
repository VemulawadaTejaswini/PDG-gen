import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        final char S[][] = new char[H+2][W+2];
        for (int i=1; i<H+1; i++) {
            S[i] =  ("#" + sc.next() + "#").toCharArray();
        }
        sc.close();
        for (int i=0; i<W+2; i++) {
            S[0][i] = '#';
            S[H+1][i] = '#';
        }
        int lr[][] = new int[H+2][W+2];
        int ud[][] = new int[H+2][W+2];

        for (int i=1; i<H+1; i++) {
            int cnt = 0;
            for (int j=0; j<W+1; j++) {
                if (S[i][j]=='.') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                lr[i][j] = cnt;
            }
            for (int j=W; j>0; j--) {
                if (lr[i][j]==0) {
                    cnt = 0;
                } else if (cnt==0) {
                    cnt = lr[i][j];
                } else {
                    lr[i][j] = cnt;
                }
            }
        }
        for (int j=1; j<W+1; j++) {
            int cnt = 0;
            for (int i=0; i<H+1; i++) {
                if (S[i][j]=='.') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                ud[i][j] = cnt;
            }
            for (int i=H; i>0; i--) {
                if (ud[i][j]==0) {
                    cnt = 0;
                } else if (cnt==0) {
                    cnt = ud[i][j];
                } else {
                    ud[i][j] = cnt;
                }
            }
        }

        int ans = 0;
        for (int i=1; i<H+1; i++) {
            for (int j=1; j<W+1; j++) {
                int cnt = lr[i][j] + ud[i][j];
                if (ans<cnt) ans = cnt;
            }
        }
        ans -= 1;
        System.out.println(ans);
    }
}