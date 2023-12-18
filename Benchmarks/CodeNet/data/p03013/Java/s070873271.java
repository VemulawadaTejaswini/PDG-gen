import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];

        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
        }

        int result = count(0, a, N);
        System.out.println(result % 1000000007);


    }

    public static int count(int n, int[] a, int N) {
        if (n > N) {
            return 0;
        }
        if (n == N-1 || n == N) {
            return 1;
        }
        for (int i : a) {
            if (i == n) {
                return 0;
            }
        }
        return count(n+1, a, N) + count(n+2, a, N);
    }

}