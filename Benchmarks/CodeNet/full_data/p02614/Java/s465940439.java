import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        char[][] c = new char[h][w];
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    cnt++;
                }
                c[i][j] = s.charAt(j);
            }
        }
        int ans = 0;
        for (int i = 0; i < (1 << h); i++) {
            for (int j = 0; j < (1 << w); j++) {
                int tempCnt = 0;
                for (int l = 0; l < h; l++) {
                    if ((i >> l & 1) == 1) {
                        continue;
                    }
                    for (int m = 0; m < w; m++) {
                        if ((j >> m & 1) == 1) {
                            continue;
                        }
                        if (c[l][m] == '#') {
                            tempCnt++;
                        }
                    }
                }
                if (tempCnt == k) {
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}