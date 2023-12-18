
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][][] data = new int[N][][];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            data[i] = new int[a][2];
            for (int j = 0; j < a; j++) {
                data[i][j][0] = sc.nextInt() - 1;
                data[i][j][1] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int bit = 0; bit < Math.pow(2, N); bit++) {
            boolean f = true;
            for (int i = 0; i < N; i++) {
                if (getBit(bit, i) == 0) {
                    continue;
                }
                for (int j = 0; j < data[i].length; j++) {
                    int shougen = data[i][j][1];
                    if (shougen != getBit(bit, data[i][j][0])) {
                        f = false;
                    }
                }
            }
            if (f) {
                ans = Math.max(ans, Integer.bitCount(bit));
            }
        }
        System.out.println(ans);
    }

    static int getBit(int bit, int digit) {
        if ((bit & (1 << (digit))) > 0) {
            return 1;
        }
        return 0;
    }
}
