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
                String[] e = br.readLine().split(" ");
                data.merge(e[0], Long.parseLong(e[1]) * Long.parseLong(e[2]), Long::sum);
            }
            
            long count = data.entrySet().stream()
                .filter(e -> e.getValue() >= 1_000_000L)
                .peek(e -> System.out.println(e.getKey()))
                .count();
            if (count == 0L) { System.out.println("NA"); }
        }
    }
}