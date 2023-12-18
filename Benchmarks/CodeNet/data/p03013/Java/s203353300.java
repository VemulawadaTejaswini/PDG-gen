import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] stair = new int[M];
        for (int i = 0; i < M; i++) {
            stair[i] = sc.nextInt();
        }
        long[] result = new long[N+1];
        int current = M-1;
        for (int i = N; i > -1; i--) {
            if (i == N) {
                continue;
            }
            if (current > -1 && i == stair[current]) {
                result[i] = 0;
                current--;
                continue;
            }
            if (i == N-1) {
                result[i] = 1;
                continue;
            }
            if (i == N-2) {
                result[i] = 1 + result[i+1];
                continue;
            }
            result[i] = result[i+1] + result[i+2];
        }
        System.out.println(result[0]%1000000007);
    }
}