import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        String w = sc.next().toUpperCase();
        int ans = 0;
        while (true) {
            String t = sc.next();
            if (t.equals("END_OF_TEXT"))    break;
            if (t.toUpperCase().equals(w))    ans++;
        }
        out.println(ans);
        
        out.flush();
    }
}
