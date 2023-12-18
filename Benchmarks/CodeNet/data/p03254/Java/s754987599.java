package atCoder.agc;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (x < a[i]) break;
            x -= a[i];
            count++;
        }
        
        so.println(count);
    }
}
