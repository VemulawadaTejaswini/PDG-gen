import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        ABCD[] abcd = new ABCD[Q];
        for (int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            abcd[i] = new ABCD(a, b, c, d);
        }
        sc.close();

        System.out.println(solve(N, M, abcd));
    }

    public static int solve(int N, int M, ABCD[] abcd) {

        int times = (int) Math.pow(2, N + M+1);

        int ans = 0;
        for (int i = 0; i < times; i++) {
            int[] A = getA(i, N, M);
            if (A == null) {
                continue;
            }

            int tempAns = 0;
            for (int j = 0; j < abcd.length; j++) {
                ABCD hoge = abcd[j];
                if (A[hoge.b - 1] - A[hoge.a - 1] == hoge.c) {
                    tempAns += hoge.d;
                }
            }

            ans = Math.max(ans, tempAns);
        }
        return ans;
    }

    public static int[] getA(int x, int N, int M) {

        int[] A = new int[N];
        int A_index = 0;
        for (int xi = 1; xi <= N + M; xi++) {
            if (x % 2 == 1) {
                if (A_index >= N) {
                    return null;
                }
                A[A_index]++;
            } else {
                A_index++;
                if (A_index < N) {
                    A[A_index] = A[A_index - 1];
                }
            }
            x /= 2;
        }

        if (A[N - 1] != M) {
            return null;
        }

        return A;
    }

}

class ABCD {
    int a;
    int b;
    int c;
    int d;

    public ABCD(int a, int b, int c, int d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
