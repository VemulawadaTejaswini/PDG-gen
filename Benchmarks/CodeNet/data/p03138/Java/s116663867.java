import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long z = 1;
        while (z <= k) {
           z = z<<1;
        }
        z = z>>1;
        long z2 = z>>1;
        
        long cnt = 0;
        long cnt2 = 0;
        for (int i = 0; i < n; i++) {
           cnt += z^a[i];
           cnt2 += z2^a[i];
        }
        
        System.out.println(cnt > cnt2 ? cnt : cnt2);
    }
}
