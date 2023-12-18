import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        int ans = 1;
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);factors.add(sum);
        for(int i = 2; i*i<=sum; i++) {
            if (sum % i == 0) {
                if (sum/i != i) factors.add(sum/i);
                factors.add(i);
            }
        }
        for(int i =0; i < factors.size(); i++) {
            int curfactor = factors.get(i);
            TreeMap<Integer, Integer> mapping = new TreeMap<>();
            long cost = 0;
            long used = 0;
            for(int j = 0; j < n; j++) {
                int cur = arr[j] % curfactor;
                if (!mapping.containsKey(cur)) mapping.put(cur, 0);
                mapping.put(cur, mapping.get(cur) + 1);
                cost += curfactor - cur;
            }
            while(!mapping.isEmpty()) {
                int minKey = mapping.firstKey();
                mapping.put(minKey, mapping.get(minKey)-1);
                if (mapping.get(minKey) == 0) mapping.remove(minKey);
                used += minKey;
                cost -= curfactor - minKey;
                //this is guaranteed to trigger since the total mod adds to zero
                if (cost == used && used <= k) ans = Math.max(ans, curfactor);
            }
        }
        out.println(ans);
        out.flush();
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
