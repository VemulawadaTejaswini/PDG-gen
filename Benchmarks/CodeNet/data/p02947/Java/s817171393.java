import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; ++i) s[i] = in.next();
        int[] vis = new int[26];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            Arrays.fill(vis, 0);
            for (int j = 0; j < 10; ++j) {
                vis[s[i].charAt(j) - 'a']++;
            }
            int t = 0;
            for (int j = 0; j < 26; ++j) {
                t = ((t * 10) % MOD + vis[j]) % MOD;
            }
            if (!map.containsKey(t)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(t, list);
            }
            else {
                ArrayList<Integer> list = map.get(t);
                list.add(i);
            }
        }
        int ans = 0;
        Set<Integer> keySet = map.keySet();
        for (Integer t : keySet) {
            ArrayList<Integer> list = map.get(t);
            int m = list.size();
            ans += (m - 1) * m / 2;
        }
        out.println(ans);
        out.close();
    }
}
