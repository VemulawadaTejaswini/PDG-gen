import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        int s = Integer.parseInt(sc.next());
        int ans = 1;
        while (true) {
            if (s == 4 || s == 2 || s == 1) {
                ans += 3;
                break;
            }
            ans++;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
        }
        out.println(ans);
        
        out.flush();
    }
}