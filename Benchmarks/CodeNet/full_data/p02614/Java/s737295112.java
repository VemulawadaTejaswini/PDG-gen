import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int k = in.nextInt();
        char cs[][] = new char[h][w];

        for (int i = 0; i < h; i++) {
            cs[i] = in.next().toCharArray();
        }

        int ans = 0;
        for (int r = 0; r <= powLong(2, h) - 1; r++) {
            for (int c = 0; c <= powLong(2, w) - 1; c++) {
                int blackCount = 0;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (((r >> i) & 1) == 0 && 
                            ((c >> j) & 1) == 0 &&
                            cs[i][j] == '#') {
                                blackCount++;
                            }
                    }
                }

                if (blackCount == k) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static final long powLong(long a, long e) {
        long r = 1;
        while (e > 0) {
            if ((e & 1) == 1) {
                r *= a;
            }
            e = e >> 1;
            a *= a;
        }
        return r;
    }
}