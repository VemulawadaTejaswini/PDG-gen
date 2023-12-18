import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    long mod = 1000000007;
    long sqrMod = 0;
    int p = 31;

    int n;

    Pair create_hashes(int mask, int type) {
        if(type == 0){
            Pair res = new Pair(0, 0);
            boolean used[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == (1 << i)) {
                    used[i] = true;
                }
            }
            for (int i = 0; i < n; i++) {
                if (used[i]) {
                    res.f = (res.f * p) % mod + s[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    res.s = (res.s * p) % mod + s[i];
                }
            }
            return res;
        }else{
            Pair res = new Pair(0, 0);
            boolean used[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == (1 << i)) {
                    used[i] = true;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (!used[i]) {
                    res.f = (res.f * p) % mod + s[n + i];
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (used[i]) {
                    res.s = (res.s * p) % mod + s[n + i];
                }
            }
            return res;
        }

    }

    char s[];
    class Pair implements Comparable<Pair>{
        long f, s;
        Pair(long f, long s){
            this.f = f;
            this.s = s;
        }

        @Override
        public int compareTo(Pair o) {
            if(f == o.f) return Long.compare(s, o.s);
            return Long.compare(f, o.f);
        }
    }

    public void solve() throws IOException {
        n = nextInt();
        s = nextToken().toCharArray();
        TreeMap<Pair, Long> map1 = new TreeMap<>(), map2 = new TreeMap<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            Pair hash = create_hashes(mask, 0);
            if(map1.containsKey(hash)){
                map1.put(hash, map1.get(hash) + 1);
            }else map1.put(hash, 1l);
            hash = create_hashes(mask, 1);
            if(map2.containsKey(hash)){
                map2.put(hash, map2.get(hash) + 1);
            }else map2.put(hash, 1l);
        }
        long ans = 0;
        for (Pair hash : map1.keySet()) {
            if(map2.containsKey(hash)){
                ans += map1.get(hash)*map2.get(hash);
            }
        }
        out.print(ans);
    }

    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    public void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}