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

        int ans = 0;
        for (int i=1; i<H+1; i++) {
            for (int j=1; j<W+1; j++) {
                int cnt = 0;
                for (int k=0;; k++) {
                    if (S[i-k][j]=='#') {
                        break;
                    } else {
                        cnt++;
                    }
                }
                for (int k=0;; k++) {
                    if (S[i+k][j]=='#') {
                        break;
                    } else {
                        cnt++;
                    }
                }
                for (int k=0;; k++) {
                    if (S[i][j-k]=='#') {
                        break;
                    } else {
                        cnt++;
                    }
                }
                for (int k=0;; k++) {
                    if (S[i][j+k]=='#') {
                        break;
                    } else {
                        cnt++;
                    }
                }
                if (ans<cnt) ans = cnt;
            }
        }
        ans -= 3;
        System.out.println(ans);
    }
}