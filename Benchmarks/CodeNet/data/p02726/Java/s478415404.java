import java.util.*;

class Main {

    static public int[] solve(int N, int X, int Y) {
        int[] res = new int[N-1];

        for (int i = 1; i < N; i++) {
            for (int j = i+1; j <= N; j++) {
                int d = Math.min(j-i, Math.abs(X-i) + 1 + Math.abs(Y-j));
                res[d-1]++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        sc.close();

        for (int n : solve(N, X, Y)) {
            System.out.println(n);
        }

    }
}