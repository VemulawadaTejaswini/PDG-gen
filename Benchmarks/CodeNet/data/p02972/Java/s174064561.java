import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] flags = new int[n];
        for (int i = 0; i < n; i++) {
            flags[i] = 0;
            while (flags[i] < Math.pow(2, n - 1)) {
                flags[i] = flags[i] << (i + 1) | (int)Math.pow(2, i);
            }
            //System.out.println("i:" + i + " " + Integer.toBinaryString(flags[i]));
        }
        
        boolean found = false;
        for (int i = 0; i < Math.pow(2, n); i++) {
            found = true;
            for (int j = 1; j <= n; j++) {
                int cnt = Integer.bitCount(i & flags[j - 1]);
                
                //System.out.println("i = " + i + " j = " + j + " flags = " + Integer.toBinaryString(flags[j - 1]));
                if (cnt % 2 != a[j - 1]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println(Integer.bitCount(i));
                for (int ii = 0; ii < n; ii++) {
                    if ((i >> ii & 1) == 1) {
                        System.out.print((ii + 1) + " ");
                    }
                }
                System.out.println();
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
