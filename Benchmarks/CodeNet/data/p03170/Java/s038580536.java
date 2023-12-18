import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] poss = new int[N];

        for(int i=0; i<N; i++)
            poss[i] = scanner.nextInt();

        getWinnerDP(K, N, poss);
    }

    public static void getWinnerDP(int K, int N, int[] poss) {

        boolean[] dp = new boolean[K + 1];

        for(int x = 1; x<=K; x++) {
            for(int stones = 0; stones < N; stones++) {
                if(poss[stones] <= x && !dp[x - poss[stones]]) {
                    dp[x] = true;
                }
            }
        }

        System.out.println(dp[K] ? "First" :  "Second");
    }
    private static boolean findWinner(int K, int N, int[] poss, int[] memo) {

        if(K == 0) {
            return false;
        }

        if(memo[K] != -1) {
            return memo[K] == 1 ? true: false;
        }

        boolean canWin = false;

        for(int i=0 ; i<N; i++) {
            if(poss[i] <= K) {
                boolean opponentResult = findWinner(K - poss[i], N, poss, memo);
                if(!opponentResult) {
                    canWin = true;
                }
            }
        }
        memo[K] = canWin ? 1: 0;
        return canWin;
    }

}
