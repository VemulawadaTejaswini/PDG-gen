import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Map<String, Long>> dataset = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int times = Integer.parseInt(br.readLine());
            if (times == 0) { break; }
            
            Map<String, Long> data = new TreeMap<>();
            for (int i=1; i <= times; i++) {
                String[] col = br.readLine().split(" ");
                data.merge(col[0], Long.parseLong(col[1]) * Long.parseLong(col[2]), Long::sum);
            }
            dataset.add(data);
        }
        
         dataset.forEach(data -> {
            long count = data.entrySet().stream()
                .filter(e -> e.getValue() >= 1_000_000)
                .peek(e -> System.out.println(e.getKey()))
                .count();
            if (count == 0) { System.out.println("NA"); }
        });
   }
}