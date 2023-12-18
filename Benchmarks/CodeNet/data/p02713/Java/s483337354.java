import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int K = Integer.parseInt(sc.next());
        long sum = 0;
        for (int i = 1; i <= K; i++)
            for (int j = 1; j <= K; j++)
                for (int m = 1; m <= K; m++)
                    sum += gcd(i,j,m);
        out.println(sum);
        
        out.flush();
    }
    public static int gcd(int x, int y, int z) {
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        while ((tmp = y % z) != 0) {
            y = z;
            z = tmp;
        }
        return z;
    }
}