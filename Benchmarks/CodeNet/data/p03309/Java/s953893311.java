import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - i;
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        long ave = sum / n;
        long ave1 = ave + 1;
        long ave2 = ave - 1;
        long k1 = 0;
        long k2 = 0;
        long k3 = 0;
        for (int i = 0; i < n; i++) {
            k1 += Math.abs(a[i] - ave);
        }
        for (int i = 0; i < n; i++) {
            k2 += Math.abs(a[i] - ave1);
        }
        for (int i = 0; i < n; i++) {
            k3 += Math.abs(a[i] - ave2);
        }
        System.out.println(Math.min(Math.min(k1, k2), k3));
    }
}