import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        List<Integer> r = new ArrayList<Integer>();
        List<Integer> g = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> b2 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (str[i] == 'R')
                r.add(i);
            if (str[i] == 'G')
                g.add(i);
            if (str[i] == 'B')
                b.add(i);
                b2.add(i*2);
        }
        // System.out.println(r.size());
        // System.out.println(g.size());
        // System.out.println(b.size());
        long ans = r.size() * b.size() * g.size();
        int count =0;
        // System.out.println(ans);
        for (int i = 0; i < r.size(); i++) {
            int rn = r.get(i);
            for (int j = 0; j < g.size(); j++) {
                int gn = g.get(j);
                //System.out.println("");
                if ((rn + gn) % 2 == 0 && Collections.binarySearch(b, (rn + gn)/2) >= 0) {
                    ans--;
                    //System.out.println('a');
                    count ++;
                }
                if (Collections.binarySearch(b, rn * 2 - gn) >= 0&&rn * 4 - gn*2!=(rn + gn)) {
                    //System.out.println('b');
                    ans--;
                    count++;
                }
                if (Collections.binarySearch(b, gn * 2 - rn) >= 0&&gn * 4 - rn*2!=rn + gn) {
                    //System.out.println('c');
                    ans--;
                    count++;
                }

            }
        }
        System.out.println(ans);
        //System.out.println(count);
    }

}
