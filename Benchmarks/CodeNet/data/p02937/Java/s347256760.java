import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        TreeSet<Integer>[] idx = new TreeSet[26];
        for (int i = 0; i < 26; i++) {
            idx[i] = new TreeSet<>();
        }

        boolean exist[] = new boolean[26];
        for (int i = 0; i < S.length(); i++) {
            int pos = S.charAt(i) - 'a';
            idx[pos].add(i);
            exist[pos] = true;
        }

        long ans = 0;
        int pos = -1;

        int tidx = 0;
        for (;tidx < T.length();) {
            int t = T.charAt(tidx) - 'a';
            if (!exist[t]) {
                System.out.println(-1);
                return;
            }
            Integer npos = idx[t].higher(pos);
            if (npos == null) {
                ans += (S.length() - 1) - pos; // go to $
                pos = -1;
            } else {
                ans += npos - pos;
                pos = npos;
                tidx++;
            }
        }
        System.out.println(ans);
    }
}