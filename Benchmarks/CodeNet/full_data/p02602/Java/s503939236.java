

import java.math.BigInteger;
import java.util.Scanner;



public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(), l = 0;
        long a[] = new long[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        BigInteger b1 = BigInteger.ONE;
        for(int i = 0; i < k; i++) b1 = b1.multiply(new BigInteger(String.valueOf(a[i])));
        for(int i = k; i < n; i++){
            BigInteger b2 = b1.divide(new BigInteger(String.valueOf(a[l++])));
            b2 = b2.multiply(new BigInteger(String.valueOf(a[i])));
            if(b2.compareTo(b1) == 1)System.out.println("Yes");
            else System.out.println("No");
            b1 = b2;
        }
    }
}
