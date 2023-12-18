import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long ans = 0;
        while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            long tmpA = b/2 + c/2;
            long tmpB = a/2 + c/2;
            long tmpC = a/2 + b/2;
            if (a == tmpA && b == tmpB && c == tmpC) {
                ans = -1;
                break;
            }
            a = tmpA;          
            b = tmpB;
            c = tmpC;
            ans++;
        }
        out.println(ans);
        
        out.flush();
    }
}