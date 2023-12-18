import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static long solve(int N, int[] A) {
        long ans = 0;
        Result prev = null;
        for (int i = 0; i < N; i++) {
            Result result = calc(i, prev, N, A);
            ans+= result.ret;
            prev = result;
        }
        return ans;
    }

    private static Result calc(int i, Result prevResult, int N, int[] A) {
        int ret;
        int l;
        int r;
        int prev;
        if( prevResult != null ) {
            // prevResultのl-r間はいい感じなので
            // (sum)からA[l]を取り除き、いい感じにして処理を進める
            ret = prevResult.r - prevResult.l;
            l = prevResult.r;
            r = l+1;
            prev = prevResult.sum ^ A[prevResult.l];

        } else {
            ret = 1;
            l = i;
            r = i+1;
            prev = A[l];
        }

        for (; r < N; r++) {
            int xor = prev ^ A[r];
            int sum = prev + A[r];
            if( xor == sum ) {
                ret++;
                prev = sum;
            } else {
                return new Result(ret, i, r-1, prev);
            }
        }

        return new Result(ret, l, N, prev);
    }

    private static class Result {
        private int ret;
        private int l;
        private int r; // このindexまでok
        private int sum; // l-rのときのsum

        public Result(int ret, int l, int r, int sum) {
            this.ret = ret;
            this.l = l;
            this.r = r;
            this.sum = sum;
        }
    }
}