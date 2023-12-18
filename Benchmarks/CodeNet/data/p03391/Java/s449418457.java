import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by darshan on 5/26/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long totalAGreaterThanBDiff = 0;
        long totalAZeroBDiff = 0;
        PriorityQueue<ALessThanBPair> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == b) {
                continue;
            }
            if (a == 0) {
                totalAZeroBDiff += b;
            } else if (a > b) {
                totalAGreaterThanBDiff += (a - b);
            } else {
                priorityQueue.add(new ALessThanBPair(a, b));
            }
        }

        long aTurns = 0;
        long bTurns = 0;
        while (!priorityQueue.isEmpty()) {
            ALessThanBPair pair = priorityQueue.poll();
            if (pair.a == pair.b) {
                continue;
            }
            if (pair.a == 0) {
                totalAZeroBDiff += pair.b;
                continue;
            }

            ALessThanBPair next = priorityQueue.peek();
            if (aTurns <= bTurns) {
                int reduceABy = pair.a;
                if (next != null) {
                    int diff = pair.b - pair.a + 1;
                    reduceABy = Math.min(reduceABy, diff);
                }
                aTurns += reduceABy;
                priorityQueue.add(new ALessThanBPair(pair.a - reduceABy, pair.b));
            } else {
                long reduceBBy = Math.min(pair.b - pair.a, aTurns - bTurns);
                bTurns += reduceBBy;
                priorityQueue.add(new ALessThanBPair(pair.a, pair.b - (int) reduceBBy));
            }
        }
        aTurns += totalAGreaterThanBDiff;
        bTurns += totalAZeroBDiff;
        if (aTurns != bTurns) {
            throw new IllegalStateException("Unequal number of turns");
        }
        System.out.println(aTurns);
    }

    private static class ALessThanBPair implements Comparable<ALessThanBPair> {
        private int a;
        private int b;

        ALessThanBPair(int a, int b) {
            if (a > b) {
                throw new RuntimeException("a must always be lesser than b");
            }
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(ALessThanBPair other) {
            int thisDiff = this.b - this.a;
            int otherDiff = other.b - other.a;
            if (thisDiff == otherDiff) {
                return other.a - this.a;
            }
            return thisDiff - otherDiff;
        }
    }
}
