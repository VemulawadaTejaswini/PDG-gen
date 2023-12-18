import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Integer[][] a = new Integer[62][n + 1];
        int t = 1;
        for (int i = 1; i <= n; i++) a[0][i] = sc.nextInt();
        for (int i = 0; i < 61; i++) {
            for (int j = 1; j <= n; j++) {
                a[i + 1][j] = a[i][a[i][j]];
            }
            if ((k >> i & 1) == 1) t = a[i][t];
        }
        out.println(t);
        out.flush();
    }
}