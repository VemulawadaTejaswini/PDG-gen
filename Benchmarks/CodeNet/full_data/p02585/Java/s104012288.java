import java.util.TreeSet;

public class Main {

    private static class Cycle {
        long score = 0;
        int size = 0;
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        var p = new int[n];
        var c = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        var logs = new TreeSet<Integer>();
        long max = c[p[0]];
        var cycleArr = new Cycle[n];
        for (int i = 0; i < n; i++) {
            long score = 0;
            int nowind = i;
            logs.clear();
            for (int t = 0; t < k; t++) {
                if (logs.contains(nowind)) {
                    Cycle cycle = cycleArr[nowind];
                    if (cycle == null) {
                        cycle = new Cycle();
                        int cycleStart = nowind;
                        int cycleInd = nowind;
                        long scoreMx = c[p[cycleInd]];
                        long cycScore = 0;
                        do {
                            cycleArr[cycleInd] = cycle;
                            cycScore += c[p[cycleInd]];
                            cycle.size++;
                            scoreMx = Math.max(scoreMx, cycScore);
                            cycleInd = p[cycleInd];
                        } while (cycleInd != cycleStart);
                        cycle.score = cycScore;
                    }
                    if (cycle.score <= 0) {
                        break;
                    } else if (cycle.size <= k - t) {
                        var cycleTimes = cycle.size / (k - t);
                        score += cycleTimes * cycle.score;
                        t += cycleTimes * cycle.size;
                    }
                    for (; t < k; t++) {
                        score += c[p[nowind]];
                        max = Math.max(score, max);
                        nowind = p[nowind];
                    }
                    continue;
                } else {
                    score += c[p[nowind]];
                    max = Math.max(score, max);
                    nowind = p[nowind];
                    logs.add(p[nowind]);
                }
            }
        }
        System.out.println(max);
    }

}
