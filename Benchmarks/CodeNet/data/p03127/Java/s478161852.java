import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int res = arr[0];

        for (int i=1; i<n; i++) {
            res = gcd(res, arr[i]);
        }

        System.out.println(res);
    }

    int gcd(int m, int n) {
        if (m < n) {
            int tmp = n;
            n = m;
            m = tmp;
        }
        if (n == 0) return m;
        if (n == 1) return 1;
        return gcd(n, m%n);
    }

}

