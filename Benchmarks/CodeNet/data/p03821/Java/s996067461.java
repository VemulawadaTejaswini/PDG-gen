import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long add = 0;
        for (int i = n - 1; i >= 0; i--) {
            a[i] += add;
            long tarinai = a[i] % b[i];
            if (tarinai > 0) {
                add += b[i] - tarinai;
            }
        }
        System.out.println(add);
    }
}