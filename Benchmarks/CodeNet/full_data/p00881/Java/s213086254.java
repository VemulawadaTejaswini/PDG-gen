import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int m, n;
    static ArrayList<String> data;
    static int[][] memo;

    static int toInt(boolean[] bool) {
        int ret = 0;
        for (boolean b: bool) {
            ret *= 2;
            if (b) ret += 1;
        }
        return ret;
    }

    // used: trueの位置はすべて同じ値 isZero: usedのtrueの位置に対して、その値が0か1か
    static int calc(boolean[] used, boolean[] isZero, ArrayList<String> rest) {
        int key = toInt(used), key2 = toInt(isZero);

        if (memo[key][key2] != -1) return memo[key][key2];
        if (rest.size() == 0 || rest.size() == 1) return 0;

        int ans = 12;
        for (int i = 0; i < m; ++i) {
            if (used[i]) continue;

            ArrayList<String> zeros = new ArrayList<>();
            ArrayList<String> ones = new ArrayList<>();
            for (String str : rest) {
                if (str.charAt(i) == '0') zeros.add(str);
                else ones.add(str);
            }

            used[i] = true;

            boolean[] tmp = new boolean[m];
            System.arraycopy(isZero, 0, tmp,0, m);
            tmp[i] = true;
            boolean[] tmp2 = new boolean[m];
            System.arraycopy(isZero, 0, tmp2,0, m);
            tmp2[i] = false;

            ans = Math.min(ans, 1 + Math.max(calc(used, tmp, zeros), calc(used, tmp2, ones)));
            used[i] = false;
        }

        memo[key][key2] = ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            if (m == 0 && n == 0) break;

            data = new ArrayList<>();
            memo = new int[(1 << m)][(1 << m)];
            for (int i = 0; i < (1 << m); ++i) {
                for (int j = 0; j < (1 << m); ++j) {
                    memo[i][j] = -1;
                }
            }

            for (int i = 0; i < n; ++i) {
                data.add(scanner.next());
            }

            System.out.println(calc(new boolean[m], new boolean[m], data));
        }
    }
}
