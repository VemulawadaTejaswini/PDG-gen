import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long div = n / (a+b);
        long rem = n % (a+b);
        long ans = a * div + rem;
        
        if (a == 0)
            pw.println("0");
        else if (n < a+b)
            pw.println(a);
        else
            pw.println(ans);
        
        pw.flush();
    }
}