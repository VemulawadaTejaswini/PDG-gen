import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long h[] = new long[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);
        long tag = n - k;
        sc.close();
        if (tag <= 0) {
            System.out.println(0);
            return;
        }
        long cnt = 0;
        for (int i = 0; i < tag; i++) {
            cnt += h[i];
        }
        System.out.println(cnt);

    }
}
