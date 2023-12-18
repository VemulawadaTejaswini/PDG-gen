import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        Map<String, Long> map = new HashMap<>();
        for (String a: arr) {
            map.merge(a, 1l, (old, value) -> { return old + value; });
        };        
        long ans = (long) Math.pow(2, N) - 1;
        if (map.size() != arr.length) {
            long temp = 1;
            for (long value : map.values()) {
              temp *= (value + 1);
            };
            ans = temp - 1;
        }
        out.println(ans % 1000000007);
        out.close();
    }
}
