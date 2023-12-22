import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        while (true) {
            StringBuilder sb = new StringBuilder(sc.next());
            if (sb.toString().equals("-"))  break;
            int m = Integer.parseInt(sc.next());
            for (int i=0; i<m; i++) {
                int n = Integer.parseInt(sc.next());
                sb = sb.append(sb.substring(0, n));
                sb.delete(0, n);
            }
            out.println(sb);
        }
        
        out.flush();
    }
}
