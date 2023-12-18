import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    char[] cs;
    int n;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
        n = cs.length;
    }

    private void solve() {
        if (cs.length == 1) {
            System.out.println(0);
            return;
        }
        int clen = 'z' - 'a' + 1;
        int[] cnt = new int[clen];
        for (int i = 0; i < n; i++)
            cnt[cs[i] - 'a']++;
        int check = 0;
        int m = -1;
        for (int i = 0; i < clen; i++) {
            if (i != 'x' - 'a' && cnt[i] == 1) {
                check++;
                m = i + 'a';
            }
        }
        if (check > 1) {
            System.out.println(-1);
            return;
        }
        int midx = -1;
        for (int i = 0; i < n; i++) {
            if (cs[i] == m)
                midx = i;
        }
        int[] cnt1 = new int[clen];
        int[] cnt2 = new int[clen];
        ArrayList<Character> cls1 = new ArrayList<>();
        ArrayList<Character> cls2 = new ArrayList<>();
        for (int i = 0; i <= midx; i++) {
            cnt1[cs[i] - 'a']++;
            cls1.add(cs[i]);
        }
        for (int i = midx; i < n; i++) {
            cnt2[cs[i] - 'a']++;
            cls2.add(0, cs[i]);
        }
        for (int i = 0; i < clen; i++) {
            if (i != 'x' - 'a' && cnt1[i] != cnt2[i]) {
                System.out.println(-1);
                return;
            }
        }
        int i = 0, j = 0;
        long ans = 0L;
        if (cls1.size() == 0 || cls2.size() == 0) {
            System.out.println(Math.max(cls1.size(), cls2.size()));
            return;
        }
        while (true) {
            char c1 = cls1.get(i);
            char c2 = cls2.get(j);
            if (c1 == m && c2 == m)
                break;
            if (c1 == 'x' && c2 == 'x')
                continue;
            if (c1 == c2) {
                i++;
                j++;
                continue;
            }
            if (c1 == 'x') {
                j--;
                ans++;
            }
            else if (c2 == 'x') {
                i--;
                ans++;
            }
            if (cls1.size() - 1 > i)
                i++;
            if (cls2.size() - 1 > j)
                j++;
        }
        System.out.println(ans);
    }
}
