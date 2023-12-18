import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        
        long sum = 0, residue = 0;
        for (int i = 0; i < n + 1; i++) {
            long ability;
            if (i != n) {
                ability = b[i] + residue;
            } else {
                ability = residue;
            }
            if (a[i] < ability) {
                sum += a[i];
                residue = ability - a[i];
            } else {
                sum += ability;
                residue = 0;
            }
        }
        System.out.println(sum);
    }
}
