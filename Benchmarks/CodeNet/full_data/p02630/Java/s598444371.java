import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            long sum = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0 ; i<n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                sum += a[i];
                hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
            }

            int q = Integer.parseInt(br.readLine());
            while(q-->0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if(hm.containsKey(x)) {
                    int fr = hm.get(x);
                    sum -= x*fr;
                    hm.put(y, hm.getOrDefault(y, 0) + fr);
                    sum += y*fr;
                }

                pw.println(sum);
            }
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
