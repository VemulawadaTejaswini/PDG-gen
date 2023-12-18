
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void solve(int n, long[] balance, String[] ops) {
        int[][] r = new int[n][3];

        for (int i=n-1;i>=0;i--) {
            if (i+1 < n) {
                for (int j=0;j<3;j++) r[i][j] += r[i+1][j];
            }
            for (int j=0;j<2;j++) {
                r[i][ops[i].charAt(j) - 'A']++;
            }
        }

        boolean good = true;
        StringBuilder ret = new StringBuilder();
        for (int i=0;i<ops.length;i++) {
            String op = ops[i];
            if (balance[op.charAt(0)-'A'] == 0 && balance[op.charAt(1)-'A'] == 0) {
                good = false;
                break;
            }
            int choose = -1;
            for (int p=0;p<2;p++) {
                char c = op.charAt(p);
                if (balance[c-'A'] >= r[i][c-'A']) {
                    choose = p;
                    break;
                }
            }
            if (choose != -1) {
                ret.append(op.charAt((choose+1)%2));
                balance[op.charAt(choose)-'A']--;
                balance[op.charAt((choose+1)%2)-'A']++;
            } else {
                if (balance[op.charAt(0)-'A'] > balance[op.charAt(1)-'A']) {
                    balance[op.charAt(0)-'A']--;
                    balance[op.charAt(1)-'A']++;
                    ret.append(op.charAt(1));
                } else {
                    balance[op.charAt(0)-'A']++;
                    balance[op.charAt(1)-'A']--;
                    ret.append(op.charAt(0));
                }
            }
        }

        if (!good) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (int i=0;i<ret.length();i++) {
                System.out.println(ret.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] balance = new long[] {in.nextLong(), in.nextLong(), in.nextLong()};
        String[] ops = new String[n];
        for(int i=0;i<n;i++) ops[i] = in.next();

        solve(n, balance, ops);
    }
}
