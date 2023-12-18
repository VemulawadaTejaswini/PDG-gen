import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n = 200000;
        int[] a = new int[n];
        long[] fq = new long[n + 1];
        //Random rnd = new Random(12313);
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            //a[i] = rnd.nextInt(2) + 1; //rnd.nextInt(n + 1) + 1;
            fq[a[i]]++;
        }
        long c = 0;
        for (int i = 1; i <= n; ++i) {
            c += (fq[i] >= 2) ? (fq[i] * (fq[i] - 1)) / 2 : 0;
        }
        for (int i = 0; i < n; ++i) {
            if (fq[a[i]] >= 2) {
                System.out.println(c - (fq[a[i]] - 1));
            }
            else {
                System.out.println(c);
            }
        }
    }
}
