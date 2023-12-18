import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int H[] = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = s.nextInt();
        }

        int longestStreak = 0;
        int streak = 0;
        int h = H[0];
        for (int i = 1; i < N; i++) {
            if (H[i-1] >= H[i]) {
                streak += 1;
            } else {
                if (longestStreak < streak) {
                    longestStreak = streak;
                }
                streak = 0;
            }
        }
        if (longestStreak < streak) {
            longestStreak = streak;
        }

        System.out.println(longestStreak);
    }

}