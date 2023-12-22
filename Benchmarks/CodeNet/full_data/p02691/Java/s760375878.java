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
        Map<Integer, Integer> mapi = new HashMap<>();

        long ans = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            mapi.put(i + A, mapi.getOrDefault(i + A, 0) + 1);
            ans += mapi.getOrDefault(i - A, 0);
        }

        os.println(ans);
    }

}