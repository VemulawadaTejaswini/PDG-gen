import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        boolean zero = false;
        long sum = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) cnt++;
            min = Math.min(min, Math.abs(arr[i]));
            if (arr[i] == 0) zero = true;
            sum += Math.abs(arr[i]);
        }

//        System.out.println(zero);
//        System.out.println(cnt);

        if (zero || (cnt % 2 == 0)) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 2 * min);
        }





    }

    int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m%n);
    }


}

