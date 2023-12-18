

import java.util.Scanner;

// 足し引きを繰り返すときは最大公約数を疑う
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        long res = arr[0];
        for(int i = 1; i < N; i++) {
            res = gcd(res, arr[i]);
        }
        System.out.println(res);

    }
    public static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
