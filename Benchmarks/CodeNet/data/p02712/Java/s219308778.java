import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final long N = Long.parseLong(sc.next());
        long sum = 0;
        for (long i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 5 != 0)   sum += i;
        }
        out.println(sum);
        
        out.flush();
    }
}