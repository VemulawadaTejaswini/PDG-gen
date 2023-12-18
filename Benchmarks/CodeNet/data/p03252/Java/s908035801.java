package abc110.C;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    char[] s, t;
    int[] as, bs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner s = new Scanner(System.in);
        this.s = s.nextLine().toCharArray();
        this.t = s.nextLine().toCharArray();
        as = new int[26];
        bs = new int[26];
    }

    private void solve() {
        Arrays.fill(as, -1);
        Arrays.fill(bs, -1);

        boolean check = itr(s, as, t) && itr(t, bs, s);
        if (check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private boolean itr(char[] src, int[] trg, char[] cmp) {
        boolean res = true;
        for (int i = 0; i < src.length; i++) {
            int ix = src[i] - 'a';
            if (trg[ix] < 0)
                trg[ix] = cmp[i];
            else
                res &= trg[ix] == cmp[i];
        }
        return res;
    }
}
