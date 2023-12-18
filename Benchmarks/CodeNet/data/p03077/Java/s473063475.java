import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // input
            long N = in.nextLong();
            long[] passengerNum = new long[5];
            for (int i = 0; i < 5; i++) {
                passengerNum[i] = in.nextLong();
            }


            // loop until all passenger get to city 6
            Status status = new Status(0, N, passengerNum);
            while (status.getPassengerInCity6() != N) {
                status.update();
                if (status.isGetStack()) {
                    out.println(status.getTime());
                    return;
                }
                status.initialize();
            }
            out.println(status.getTime());

        }

        public class Status {
            long time;
            long N;
            long bottleNeck;
            long[][] dp = new long[2][6];
            long[] passengerNum = new long[6];

            private void setPassengerNum(long[] passengerNum) {
                this.passengerNum = passengerNum;
            }

            private void setTime(long time) {
                this.time = time;
            }

            private void setN(long N) {
                this.N = N;
            }

            public long getTime() {
                return time;
            }

            public long getPassengerInCity6() {
                return this.dp[1][5];
            }

            public void setBottleNeck(long[] passengerNum) {
                long min = passengerNum[0];
                for (int i = 1; i < passengerNum.length; i++) {
                    if (min > passengerNum[i]) {
                        min = passengerNum[i];
                    }
                }
                this.bottleNeck = min;
            }

            public Status(long time, long N, long[] passengerNum) {
                setTime(time);
                setN(N);
                setPassengerNum(passengerNum);
                setBottleNeck(passengerNum);
                dp[0][0] = N;
                for (int i = 1; i < 6; i++) {
                    dp[0][i] = 0;
                }
            }

            public boolean isGetStack() {
                boolean result = false;
                for (int i = 1; i < 5; i++) {
                    if (dp[0][i] != dp[1][i]) {
                        return result;
                    }
                }
                System.out.println(this.getTime());
                time += (dp[1][0] - 1) / bottleNeck + 5;
                return true;
            }

            public void update() {
                time++;
                this.dp[1][0] = updateCity1(dp[0][0], passengerNum[0]);
                for (int i = 1; i < 5; i++) {
                    this.dp[1][i] = updateBetweenCity(dp[0][i - 1], dp[0][i], passengerNum[i - 1], passengerNum[i]);
                }
                this.dp[1][5] = updateCity6(dp[0][4], dp[0][5], passengerNum[4]);

            }

            private long updateCity6(long waitingPeople5, long waitingPeople6, long passengerNum5) {
                return waitingPeople6 + Math.min(waitingPeople5, passengerNum5);
            }

            private long updateCity1(long waitingPeople1, long passengerNum) {
                if (waitingPeople1 > passengerNum) {
                    return waitingPeople1 - passengerNum;
                }
                return 0;
            }

            private long updateBetweenCity(long waitingPeople1, long waitingPeople2, long passengerNum1, long passengerNum2) {
                return waitingPeople2 + Math.min(waitingPeople1, passengerNum1) - Math.min(waitingPeople2, passengerNum2);
            }

            public void initialize() {
                for (int i = 0; i < dp[0].length; i++) {
                    dp[0][i] = dp[1][i];
                }
            }

        }

    }
}

