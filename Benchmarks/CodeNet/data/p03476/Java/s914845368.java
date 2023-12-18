import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tmp = new int[100001];
        for (int i = 1; i < tmp.length; i++) {
            if (isPrime(i)) {
                tmp[i] = 1;
            }
        }
        int[] A = new int[100001];
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (tmp[i] == 1 && tmp[(i + 1) / 2] == 1) {
                A[i] = 1;
            }
        }
        int[] S = new int[100001];
        for (int i = 0; i < 100000; i++) {
            S[i + 1] = S[i] + A[i];
        }
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            right++;
            System.out.println(S[right] - S[left]);
        }
    }

    private static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}