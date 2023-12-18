import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long W;
        W = sc.nextLong();
        String[] S = new String[(int)(H)];
        for(int i = 0 ; i < H ; i++){
                S[i] = sc.next();
        }

        final Solver solver = new Solver();
        solver.solve(H, W, S);
    }
}

class Solver {
    final static char OBSTACLE = '#';

    public void solve(long H, long W, String[] S) {
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i].charAt(j) == OBSTACLE) continue;
                max = Math.max(max, count(i, j, S));
            }
        }

        System.out.println(max);
    }

    private int count(int i, int j, String[] S) {
        final int H = S.length;
        final int W = S[0].length();

        int count = 1;

        int left = j - 1;
        while (left >= 0 && S[i].charAt(left) != OBSTACLE) {
            count++;
            left--;
        }

        int right = j + 1;
        while (right < W && S[i].charAt(right) != OBSTACLE) {
            count++;
            right++;
        }

        int up = i - 1;
        while (up >= 0 && S[up].charAt(j) != OBSTACLE) {
            count++;
            up--;
        }

        int down = i + 1;
        while (down < H && S[down].charAt(j) != OBSTACLE) {
            count++;
            down++;
        }

        // System.out.println("(i, j, c) = " + i + ", " + j + ", " + count + ")");
        return count;
    }
}

