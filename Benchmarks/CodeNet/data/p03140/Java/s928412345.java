import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            char c = C.charAt(i);
            if (a == b && b == c) {
                // do nothing
            } else if (a == b || b == c || c == a) {
                ans++;
            } else {
                ans += 2;
            }
        }
        out.println(ans);
        out.close();
    }
}
