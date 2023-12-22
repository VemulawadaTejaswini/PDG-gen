
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() > 1) continue;

            int v = e.getKey();
            boolean isPrime = true;
            for(int i = 2 ; i * i <= v; i++) {
                if(v%i == 0) {
                    if(map.containsKey(i) || map.containsKey(v/i)){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) ans++;
        }

        os.println(ans);
    }
}