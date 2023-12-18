import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int[] diff = new int[n];
        for (int i=0; i<n; i++) {
            diff[i] = Math.abs(arr[i] - m);
        }

        int res = diff[0];

        for (int i=1; i<n; i++) {
            res = gcd(res, diff[i]);
        }

        System.out.println(res);

    }

    int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m%n);
    }


}

