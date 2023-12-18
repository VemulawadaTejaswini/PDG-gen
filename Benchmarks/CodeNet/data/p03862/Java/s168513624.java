import java.util.Scanner;

public class Main {
    static int n;
    static int x;
    static long[] a;
    static long[] sumA;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        a = new long[n];
        sumA = new long[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            sumA[i-1] = a[i] + a[i-1];
        }
        long next = 0;
        for (int i = 0; i < n; i++) {
            if (sumA[i] > x) {
                if (next > 0) {
                    //前回減らしていた場合、その分減らす
                    ans += Math.max(0, sumA[i] - x - next);
                    next = 0;
                } else {
                    //前回減らしていない場合は、次回を減らす
                    ans += sumA[i] - x;
                    next = sumA[i] - x;
                }
            }
        }
        System.out.println(ans);
    }
}