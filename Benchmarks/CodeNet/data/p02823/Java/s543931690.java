import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
        long games = getMatchGames(N, A, B);
        System.out.println(games);
    }
    private static long getMatchGames(long N, long A, long B) {
        long small = Math.min(A,B);
        long large = Math.max(A,B);

        long games = 0;
        if ((large - small) % 2 == 0) {
            games = (large - small) / 2;
        } else {
            long win = N - large;
            long lose = small - 1;
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
