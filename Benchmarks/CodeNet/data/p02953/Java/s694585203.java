import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        String ans = "Yes";
        
        for (int i = 0; i < N - 1; i++) {
            if (h[i] - 1 > h[i + 1]) {
                ans = "No";
                break;
            }
        }
        if (ans.equals("Yes")) {
            for (int i = 0; i < N - 2; i++) {
                if (h[i] > h[i + 1] && h[i + 1] > h[i + 2]) {
                    ans = "No";
                    break;
                }
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}