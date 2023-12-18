import java.util.Scanner;

public class Main {

    private static boolean[] isprime = new boolean[100001];

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for (int i = 2; i <= 100000; i++) {
            isprime[i] = isPrime(i);
        }
        for (int i = 0; i < q; i++) {
            int cnt = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                if (isprime[j] && isprime[(j + 1) / 2]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

}
