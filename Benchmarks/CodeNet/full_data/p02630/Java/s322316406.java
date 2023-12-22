import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long sum = 0;
        HashMap<Long, Long> mp = new HashMap<>();
        for(int i=0; i<n; i++) {
            long x = fs.nextLong();
            sum += x;
            if(mp.containsKey(x))
                mp.put(x, mp.get(x)+1);
            else
                mp.put(x, 1L);
        }

        int q = fs.nextInt();
        while(q-- > 0) {
            long b = fs.nextLong();
            long c = fs.nextLong();
            sum -= b * mp.getOrDefault(b, 0L);
            sum += c * mp.getOrDefault(b, 0L);
            mp.put(c, mp.getOrDefault(c, 0L) + mp.getOrDefault(b, 0L));
            mp.replace(b, 0L);
            System.out.println(sum);
        }
    }

    static class FastScanner {
        BufferedReader br = null;
        StringTokenizer st;
    
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while(st == null || !st.hasMoreElements()) {
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
    
        String nextLine() {
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