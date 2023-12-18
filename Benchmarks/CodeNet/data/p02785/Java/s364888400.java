import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int mod = 1000000007;
    static BigInteger bmod = new BigInteger("1000000007");

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        k = Math.min(k, n);
        Arrays.sort(a);
        long res = 0;
        for(int i=0; i<n-k; i++) {
            res += a[i];
        }

        System.out.println(res);
    }



}
