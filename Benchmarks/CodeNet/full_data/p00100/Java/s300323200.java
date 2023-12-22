import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int n = Integer.parseInt(br.readLine());
            if (n == 0) { break; }
            
            Map<String, Long> data = new LinkedHashMap<>();
            for (int i=1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String e = st.nextToken();
                Long p = Long.parseLong(st.nextToken());
                Long q = Long.parseLong(st.nextToken());
                data.put(e, data.getOrDefault(e, 0L) + p * q);
            }
            
            int cnt = 0;
            for(Map.Entry<String, Long> e : data.entrySet()){
                if(e.getValue() >= 1_000_000){
                    System.out.println(e.getKey());
                    cnt++;
                }
            }
            if (cnt == 0) {
                System.out.println("NA");
            }
        }
    }
}