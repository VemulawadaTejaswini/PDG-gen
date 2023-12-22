import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
        DecimalFormat df = new DecimalFormat("0.00000000");
        while (true) {
            int n = Integer.parseInt((sc.next()));
            if (n == 0) break;
            int[] s = new int[n];
            for (int i = 0; i < n; i++)
                s[i] = Integer.parseInt((sc.next()));
            out.println(df.format(Math.sqrt(var(s, n))));
        }
        out.flush();
    }
    public static double avg(int[] a, int n) {
        double sum = 0.0;
        for (int i=0; i<n; i++)
            sum += a[i];
        return (sum / n);
    }
    public static double var(int[] a, int n) {
        double sum = 0.0;
        for (int i=0; i<n; i++)
            sum += (a[i]-avg(a,n))*(a[i]-avg(a,n));
        return (sum / n);
    }
}
