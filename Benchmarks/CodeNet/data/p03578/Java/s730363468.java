import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    int n, m;
    long[] ds, ts;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            line = br.readLine();
            n = Integer.parseInt(line);
            ds = new long[n];
            String[] ss = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ds[i] = Long.parseLong(ss[i]);
            }
            m = Integer.parseInt(br.readLine());
            ts = new long[m];
            ss = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                ts[i] = Long.parseLong(ss[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        HashMap<Long, Integer> nMap = new HashMap<>();
        HashMap<Long, Integer> mMap = new HashMap<>();
        for (long l: ds) {
            int i = nMap.getOrDefault(l, -1);
            if (i == -1)
                nMap.put(l, 1);
            else
                nMap.put(l, i+1);
        }
        for (long l: ts) {
            int i = mMap.getOrDefault(l, -1);
            if (i == -1)
                mMap.put(l, 1);
            else
                mMap.put(l, i+1);
        }
        Iterator<Long> itr = mMap.keySet().iterator();
        boolean flg = true;
        while (itr.hasNext()) {
            long trg = itr.next();
            int cnt = mMap.get(trg);
            int ncnt = nMap.getOrDefault(trg, -1);
            flg &= ncnt >= cnt;
        }
        if (flg)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
