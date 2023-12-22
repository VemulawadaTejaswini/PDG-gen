import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long max = (long) Math.pow(10, 18);
        long[] a = new long[n];
        BigInteger sum = new BigInteger("1");

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                return;
            } else if (a[i] > max) {
                System.out.println(-1);
                return;
            }


        }

        for (int i = 0; i < n; i++) {
            sum = sum.multiply(BigInteger.valueOf(a[i]));
            if (sum.compareTo(BigInteger.valueOf(max))==1) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sum);



        scn.close();


    }


}