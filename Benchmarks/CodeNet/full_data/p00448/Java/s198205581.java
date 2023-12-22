import java.util.BitSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int r = in.nextInt(), c = in.nextInt();
            if (r == 0 && c == 0) {
                in.close();
                break;
            }
            BitSet[] bits = new BitSet[r];
            for (int i = 0; i < r; i++) {
                bits[i] = new BitSet(c);
                for (int j = 0; j < c; j++) {
                    int input = in.nextInt();
                    if (input == 1) bits[i].set(j);
                }
            }
            int perms = 1 << r;  // ?????°?????±???2^r????????¢
            int result = 0;
            for (int i = 0; i < perms; i++) {
                // ?????????????????¢
                for (int j = 0; j < r; j++) {
                    if ((i & (1 << j)) > 0) {
                        bits[j].flip(0, c);    // ?????¬
                    }
                }
                // ???????????°?????????????????¶?????¢????????¢?????°??????????????§?????????
                int possible = 0;
                for (int k = 0; k < c; k++) {
                    int up = 0;
                    for (int v = 0; v < r; v++) {
                        if (bits[v].get(k)) {
                            up++;
                        }
                    }
                    possible += Math.max(up, r - up);
                }
                result = Math.max(result, possible);
                for (int u = 0; u < r; u++) {
                    if ((i & (1 << u)) > 0) {
                        bits[u].flip(0, c);
                    }
                }
            }
            System.out.println(result);
        }
    }
}