import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int D = Integer.parseInt(sc.next());
        final int N = Integer.parseInt(sc.next());
        int cnt = 0;
        int ans = 0;
        
        for (int i = 1; cnt < N; i++) {
            if (func(i) == D) {
                cnt++;
                ans = i;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
    
    public static int func(int x) {
        if (x % 100 != 0) return 0;
        return func(x / 100) + 1;
    }
}