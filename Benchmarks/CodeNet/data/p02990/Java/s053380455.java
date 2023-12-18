import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 1; i < K+1; i++) {
            // blue ball 計算
            long blueCount = comb(K-1, i-1);
            long redCount = comb(N-K+1, i);
            System.out.println((blueCount * redCount) % 1000000007);
        }
    }
    private static long comb(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        long mother = 1;
        long child = 1;
        for (int i = 0; i < k; i++) {
            child *= n-i;
            mother *= i+1;
        }
        return child/mother;
    }
}