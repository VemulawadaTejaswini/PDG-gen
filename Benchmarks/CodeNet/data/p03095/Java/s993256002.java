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
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(a -> {
            map.merge(a, 1, (old, value) -> {
                return old + 1;
            });
        });
        
        long ans = (long) Math.pow(2, N) - 1;
        if (map.size() != arr.length) {
          	ans = 1;
            for (int value : map.values()) {
              ans *= (value + 1);
            };
            ans--;
        }
        out.println(ans % 1000000007);
        out.close();
    }
}
