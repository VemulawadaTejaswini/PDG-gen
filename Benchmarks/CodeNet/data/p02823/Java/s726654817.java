import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int games = getMatchGames(N, A, B);
        System.out.println(games);
    }
    private static int getMatchGames(int N, int A, int B) {
        int small = Math.min(A,B);
        int large = Math.max(A,B);

        int games = 0;
        if ((large - small) % 2 == 0) {
            games = (large - small) / 2;
        } else {
            int win = N - large;
            int lose = small - 1;
            if (win < lose) {
                games += (win + 1);
                small += (win + 1);
                large += win;
            } else {
                games += (lose + 1);
                small -= lose;
                large -= (lose + 1);
            }
            games += getMatchGames(N, small, large);
        }
        return games;
    }
}
