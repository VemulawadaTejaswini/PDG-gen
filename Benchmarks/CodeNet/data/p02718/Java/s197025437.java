import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
//            pw.println(a[i]);
        }
        Arrays.sort(a);
        int sum = 0;
        for (int i=0; i<n; i++)
            sum += a[i];
        int line = sum * (1 / (4 * m));
        String ans = "Yes";
        for (int i = n-1; i >= n-m; i--)
            if (a[i] < line) ans = "No";
        pw.println(ans);
        pw.flush();
    }
}