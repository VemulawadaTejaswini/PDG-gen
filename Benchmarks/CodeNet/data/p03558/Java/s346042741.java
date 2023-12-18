import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int K = in.nextInt();

            int min = naive2(K);

            System.out.println(min);
        }
    }

    private static int naive(int K) {
        int min = (int) 1e9;
        for (int i = 1; i < 1000; i++) {
            int k = K * i;
            int sum = 0;
            for (; k > 0;) {
                sum += k % 10;
                k /= 10;
            }
            // Utils.debug(K, i, sum);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    private static int naive2(int K) {
        class State implements Comparable<State> {
            int sum;
            int reminder;
            int keta;
            int number;

            @Override
            public int compareTo(State o) {
                if (sum < o.sum) {
                    return -1;
                }
                if (sum > o.sum) {
                    return 1;
                }
                return 0;
            }

            @Override
            public int hashCode() {
                final int prime = 613;
                int result = 1;
                // result = prime * result + keta;
                result = prime * result + reminder;
                result = prime * result + sum;
                // result = prime * result + number;
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                State other = (State) obj;
                // if (keta != other.keta)
                // return false;
                if (reminder != other.reminder)
                    return false;
                if (sum != other.sum)
                    return false;
                // if (number != other.number)
                // return false;
                return true;
            }

        }
        PriorityQueue<State> pq = new PriorityQueue<>();
        HashSet<State> used = new HashSet<>();
        {

            State e = new State();
            e.keta = 0;
            e.reminder = 0;
            e.sum = 0;
            e.number = 0;
            pq.add(e);
            used.add(e);
        }
        int min = (int) 1e9;
        for (; !pq.isEmpty();) {
            State current = pq.poll();

            // Utils.debug(current.sum, current.number, current.number * K);

            if (current.number > 0 && current.reminder == 0) {
                if (current.sum < min) {
                    min = current.sum;
                }
                Utils.debug(current.sum, current.number, K * current.number);
                // min = Math.min(min, current.sum);
            }

            if (current.keta > 15) {
                continue;
            }

            for (int i = 0; i < 10; i++) {
                if (i == 0 && current.keta == 0) {
                    continue;
                }
                State e = new State();
                e.keta = current.keta + 1;
                e.sum = current.sum + ((current.reminder + K * i) % 10);
                e.reminder = (current.reminder + K * i) / 10;
                e.number = (int) (current.number + Math.pow(10, current.keta) * i);
                if (used.add(e)) {
                    pq.add(e);
                }
            }

        }

        return min;
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
