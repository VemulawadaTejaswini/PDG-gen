import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int n = Integer.parseInt(br.readLine());
            if (n == 0) { break; }
             
            Map<String, Long> data = new HashMap<>();
            int cnt = 0;
            for (int i=1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String e = st.nextToken();
                Long total = data.getOrDefault(e, 0L);
                if (total == null) continue;
                
                Long p = Long.parseLong(st.nextToken());
                Long q = Long.parseLong(st.nextToken());
                total += p * q;
                if (total >= 1_000_000L) {
                    System.out.println(e);
                    total = null;
                    cnt++;
                }
                data.put(e, total);
            }
            if (cnt == 0) {
                System.out.println("NA");
            }
        }
    }
}