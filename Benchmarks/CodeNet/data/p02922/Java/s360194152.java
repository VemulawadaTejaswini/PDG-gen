import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        int sockets = 1;
        int ans = 0;
        while (sockets < B) {
            sockets += A-1;
            ans++;
        }
        out.println(ans);

        out.flush();
    }
}