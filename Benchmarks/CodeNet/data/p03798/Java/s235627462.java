import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static char UNDETERMINED = 'D';
    private static char SHEEP = 'S';
    private static char WOLF = 'W';
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String s = scan.next();
        char[] d = s.toCharArray();
        if (solve(N, d, Main.SHEEP, Main.SHEEP)) {
            return;
        }
        if (solve(N, d, Main.SHEEP, Main.WOLF)) {
            return;
        }
        if (solve(N, d, Main.WOLF, Main.SHEEP)) {
            return;
        }
        if (solve(N, d, Main.WOLF, Main.WOLF)) {
            return;
        }
        System.out.println(-1);
    }
    private static boolean solve(int N, char[] d, char x, char y) {
        char[] candidates = new char[N];
        Arrays.fill(candidates, Main.UNDETERMINED);
        candidates[0] = x;
        candidates[1] = y;
        for (int i = 0; i < N; i++) {
            if (candidates[i] == Main.SHEEP && d[i] == 'o' || candidates[i] == Main.WOLF && d[i] == 'x') {
                if (candidates[(i + N - 1) % N] == Main.UNDETERMINED) {
                    candidates[(i + N - 1) % N] = candidates[i + 1];
                    continue;
                }
                if (candidates[(i + 1) % N] == Main.UNDETERMINED) {
                    candidates[(i + 1) % N] = candidates[(i + N - 1) % N];
                    continue;
                }
                if (candidates[(i + 1) % N] == candidates[(i + N - 1) % N]) {
                    continue;
                }
                return false;
            } else {
                if (candidates[(i + N - 1) % N] == Main.UNDETERMINED) {
                    candidates[(i + N - 1) % N] = candidates[i+1] == Main.SHEEP ? Main.WOLF : Main.SHEEP;
                    continue;
                }
                if (candidates[(i + 1) % N] == Main.UNDETERMINED) {
                    candidates[(i + 1) % N] = candidates[(i + N - 1) % N] == Main.SHEEP ? Main.WOLF : Main.SHEEP;
                    continue;
                }
                if (candidates[(i + 1) % N] != candidates[(i + N - 1) % N]) {
                    continue;
                }
                return false;
            }
        }
        System.out.println(candidates);
        return true;
    }
}
