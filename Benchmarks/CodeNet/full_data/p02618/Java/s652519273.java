import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int D;
    int D1;
    // C[c]:=c開催しない場合の係数
    int[] C;
    // S[d][c]:=d日にc開催
    int[][] S;
    long score;
    long bestScore;

    // スケジュール
    // schedule[d]:=d日目の開催
    int[] schedule;
    // last[d][c]:=d日目にcをやっていない日数
    int[][] last;

    int[] bestSchedule;
    int[][] bestLast;

    double temperature;

    private long evaluate() {
        long sum = 0;
        for (int i = 1; i <= D; i++) {
            sum += S[i][schedule[i]];
        }
        for (int d = 1; d <= D; d++) {
            for (int c = 1; c <=26; c++) {
                sum -= C[c] * (d - last[d][c]);
            }
        }
        return sum;
    }

    private void init() {
        // read & init solution
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        D1 = D + 1;

        schedule = new int[D1];
        last = new int[D1][27];
        Arrays.fill(last[0], 0);
        C = new int[27];
        for (int i = 1; i <= 26; i++) {
            C[i] = sc.nextInt();
        }
        S = new int[D1][27];
        //bestContestOfDay = new int[D1];
        for (int j = 1; j <= D; j++) {
            int max = 0;
            for (int i = 1; i <= 26; i++) {
                S[j][i] = sc.nextInt();
                if (S[j][i] > max) {
                    max = S[j][i];
                    //bestContestOfDay[j] = i;
                    schedule[j] = i;
                }
            }
            // last
            for (int i = 1; i <= 26; i++) {
                if (i == schedule[j]) {
                    last[j][i] = j;    
                    continue;
                }
                last[j][i] = last[j-1][i];
            }
        }
        score = evaluate();
        //System.err.println("init score=" + score);
        bestScore = score;
        bestSchedule = schedule.clone();
    }

    private void output() {
        for (int i = 1; i <= D; i++) {
            System.out.println(bestSchedule[i]);
        }
        // schedule = bestSchedule.clone();
        // System.err.println(evaluate());
    }

    double moveProbabilty(double cost) {
        //System.err.println("cost" + cost);
        return Math.exp(cost/temperature);
    }

    private void doSA() {
        for (int k = 0; k < 100; k++) {
            int changeDay = (int)(Math.random() * D) + 1;
            int changeContest = (int)(Math.random() * 26) + 1;
            int orgContest = schedule[changeDay];
            schedule[changeDay] = changeContest;

            int[] orgLastChangeContest = new int[D1];
            int[] orgLastOrgContest = new int[D1];

            for (int d = changeDay; d <= D && schedule[d] != changeContest; d++) {
                orgLastChangeContest[d] = last[d][changeContest];
                last[d][changeContest] = changeDay;
            }
            for (int d = changeDay; d <= D && schedule[d] != orgContest; d++) {
                orgLastOrgContest[d] = last[d][orgContest];
                last[d][orgContest] = last[changeDay-1][orgContest];
            }

            long tmpScore = evaluate();
            //System.err.println(tmpScore);

            if (tmpScore > score) {
                // System.err.println("UPDATE! " + tmpScore + " " + bestScore);
                // Arrays.stream(schedule).forEach(s -> System.out.print(s + " "));
                // System.out.println();
                score = tmpScore;

                if (score > bestScore) {
                    bestScore = score;
                    bestSchedule = schedule.clone();
                }

            } else {
                double prob = moveProbabilty(tmpScore - score);
                //System.err.println(prob);
                if (Math.random() < prob) {
                    score = tmpScore;
                } else {
                    // 復元
                    schedule[changeDay] = orgContest;
                    for (int d = changeDay; d <= D && schedule[d] != changeContest; d++) {
                        last[d][changeContest] = orgLastChangeContest[d];
                    }
                    for (int d = changeDay; d <= D && schedule[d] != orgContest; d++) {
                        last[d][orgContest] = orgLastOrgContest[d];
                    }        
                }

            }
        }
    }

    double calcTemperature() {
        return temperature*0.95;
    }

    public void run() {
        long start = System.nanoTime();
        init();

        temperature = 1000000;
        while((System.nanoTime() - start)/1.0e6 < 2000) {
            temperature = calcTemperature();
            doSA();
            //System.err.println(temperature + " " + bestScore);
        }
        output();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}