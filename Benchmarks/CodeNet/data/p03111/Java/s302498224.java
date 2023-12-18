import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int ans = Integer.MAX_VALUE;
    private static int[] values;
    private static int a;
    private static int b;
    private static int c;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = in.nextInt();
        }

        char[] patterns = new char[N];
        dfs(N, 0, patterns);

        System.out.println(ans);
    }

    private static void dfs(int depth, int currentDepth, char[] patterns) {
        if (depth == currentDepth) {
            ans = Math.min(ans, calcMp(a, b, c, patterns));
            return;
        }

        char[] patternA = patterns.clone();
        patternA[currentDepth] = 'A';
        dfs(depth, currentDepth + 1, patternA);

        char[] patternB = patterns.clone();
        patternB[currentDepth] = 'B';
        dfs(depth, currentDepth + 1, patternB);

        char[] patternC = patterns.clone();
        patternC[currentDepth] = 'C';
        dfs(depth, currentDepth + 1, patternC);

        char[] patternD = patterns.clone();
        patternD[currentDepth] = 'D';
        dfs(depth, currentDepth + 1, patternD);
    }

    private static int calcMp(int a, int b, int c, char[] patterns) {
        int numOfA = 0;
        int numOfB = 0;
        int numOfC = 0;

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (patterns[i] == 'A') {
                numOfA++;
                totalA += values[i];
            }
            if (patterns[i] == 'B') {
                numOfB++;
                totalB += values[i];
            }
            if (patterns[i] == 'C') {
                numOfC++;
                totalC += values[i];
            }
        }

        if (numOfA == 0 || numOfB == 0 || numOfC == 0) {
            return Integer.MAX_VALUE;
        }

        int appendMp = ((numOfA - 1 ) * 10) + ((numOfB - 1) * 10) + ((numOfC - 1) * 10);
        int strechMp = Math.abs(a - totalA) + Math.abs(b - totalB) + Math.abs(c - totalC);

        return appendMp + strechMp;
    }
}
