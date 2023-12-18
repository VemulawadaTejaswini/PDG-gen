import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    public static void main(String args[]) {
        int t = 1;//ni();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = (long) 1e9 + 7;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static int maxn = 200005;

    static int bin(int l, int r, List<Integer> list, int cur, int n) {
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int len = cur - list.get(mid) + 1;
            if ((n - mid + 1) > len / 2) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }

    static void solve() {
        char s[] = sn().toCharArray();
        int n = s.length;
        HashMap<Character, List<Integer>> map = new HashMap<>();
        int l = -1, r = -1;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s[i])) {
                List<Integer> temp = map.get(s[i]);
                int size = temp.size();
                int res = bin(0, size - 1, temp, i, size);
                if (res != -1) {
                    l = temp.get(res) + 1;
                    r = i + 1;
                    break;
                }
                map.get(s[i]).add(i);
            } else {
                map.put(s[i], new ArrayList<>());
                map.get(s[i]).add(i);
            }
        }
        out.println(l + " " + r);
    }
}