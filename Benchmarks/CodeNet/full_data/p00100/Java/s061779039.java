import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int n = Integer.parseInt(br.readLine());
            if (n == 0) { break; }
            
            Map<String, Long> data = new LinkedHashMap<>();
            Map<String, Long> out = new HashMap<>();
            for (int i=1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String e = st.nextToken();
                Long p = Long.parseLong(st.nextToken());
                Long q = Long.parseLong(st.nextToken());
                Long total = data.getOrDefault(e, 0L) + p * q;
                data.put(e, total);
                if (total >= 1_000_000L) {
                    if (out.putIfAbsent(e, total) == null) {
                        System.out.println(e);
                    }
                }
            }
            if (out.size() == 0) {
                System.out.println("NA");
            }
        }
    }
}