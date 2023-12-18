import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        TreeSet<Integer>[] segs = new TreeSet[26];
        for (int i = 0; i < 26; i++) {
            segs[i] = new TreeSet<>();
            segs[i].add(510000);
        }
        for (int i = 0; i < N; i++) {
            segs[(int) d[i]-'a'].add(i);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                int index = scan.nextInt()-1;
                char old_c = d[index];
                char new_c = scan.next().toCharArray()[0];
                if (old_c == new_c) {
                    continue;
                }
                segs[(int)old_c-'a'].remove(index);
                segs[(int)new_c-'a'].add(index);
                d[index] = new_c;
                continue;
            }
            int l = scan.nextInt()-1;
            int r = scan.nextInt()-1;
            int ans = 0;
            for (int j = 0; j < 26; j++) {
                if (segs[j].ceiling(l) <= r) {
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}
