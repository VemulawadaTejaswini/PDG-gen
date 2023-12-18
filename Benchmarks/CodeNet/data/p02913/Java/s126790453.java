import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

//        Set<Integer>[] idxList = new Set[26];
//        for (int i = 0; i < 26; i++) {
//            idxList[i] = new HashSet<>();
//        }
//
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            idxList[c - 'a'].add(i);
//        }

//        debug(idxList);

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int l1Idx = i;
            int d = ans;
            for (int j = i + d + 1; j < n; j++) {
                int r1Idx = i;
                int l2Idx = j;
                int r2Idx = j;
                while (r2Idx < n && s.charAt(r1Idx) == s.charAt(r2Idx) && r1Idx < l2Idx) {
                    r1Idx++;
                    r2Idx++;
                }
                ans = Math.max(ans, r1Idx - l1Idx);
//                debug(l1Idx, r1Idx, l2Idx, r2Idx, ans);
                if (r1Idx == l2Idx) break;

            }
        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
