
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int d;
    private static int type = 26;

    private static int[] c;
    private static int[][] s;
    private static int[] maxS;

    private static long bestScore;
    private static int[] bestAns;
    private static long currentScore;
    private static int[] currentAns;

    private static long currentTime;
    private static long endTime;
    private static long simTime = 1650;

    private static double sa = simTime * 10000;

    private static Random rand = new Random(0);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        d = Integer.parseInt(scan.next());
        c = new int[type];
        for (int i = 0; i < type; i++) {
            c[i] = Integer.parseInt(scan.next());
        }
        s = new int[d][type];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < type; j++) {
                s[i][j] = Integer.parseInt(scan.next());
            }
        }
        scan.close();

        maxS = new int[d];
        for (int i = 0; i < d; i++) {
            int max = s[i][0];
            int maxType = 0;
            for (int j = 1; j < type; j++) {
                if (max < s[i][j]) {
                    max = s[i][j];
                    maxType = j;
                }
            }
            maxS[i] = maxType;
        }

        bestAns = createInitSol();
        bestScore = calcTotalScore(bestAns, d - 1);
        currentAns = bestAns;
        currentScore = bestScore;

        endTime = System.currentTimeMillis() + simTime;
        currentTime = System.currentTimeMillis();
        while (currentTime < endTime) {
            int[] neighborAns = change(currentAns);
            long neighborScore = calcTotalScore(neighborAns, d - 1);

            if (neighborScore > bestScore) {
                bestAns = neighborAns;
                bestScore = neighborScore;
            }

            double saValue = (double)(endTime - currentTime) / sa;
            if (neighborScore >= currentScore || saValue > rand.nextDouble()) {
                currentAns = neighborAns;
                currentScore = neighborScore;
            }

            currentTime = System.currentTimeMillis();
        }
        for (int i = 0; i < d; i++) {
            System.out.println(bestAns[i] + 1);
        }
    }

    private static long calcTotalScore(int[] t, int lastDay) {
        int[] prevContest = new int[type];
        Arrays.fill(prevContest, -1);
        long score = 0;
        for (int i = 0; i <= lastDay; i++) {
            score += s[i][t[i]];
            prevContest[t[i]] = i;
            for (int j = 0; j < type; j++) {
                score -= c[j] * (i - prevContest[j]);
            }
        }
        return score;
    }

    private static int[] createInitSol() {
        int[] initSol = new int[d];

        for (int i = 0; i < d; i++) {
            int bestType = -1;
            long bestScore = Long.MIN_VALUE;
            for (int j = 0; j < type; j++) {
                initSol[i] = j;
                long score = calcTotalScore(initSol, i);
                if (score > bestScore) {
                    bestScore = score;
                    bestType = j;
                }
            }
            initSol[i] = bestType;
        }

        return initSol;
    }

    private static int[] change(int[] curAns) {
        int[] neighbor = new int[d];
        for (int i = 0; i < d; i++) {
            neighbor[i] = curAns[i];
        }
        int day = rand.nextInt(d);
        int t = rand.nextInt(type);
        neighbor[day] = t;
        return neighbor;
    }

}
