import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;



public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            long[] t = new long[N];
            long[] d = new long[N];
            for (int i = 0; i < N; i++) {
                t[i] = in.nextInt();
                d[i] = in.nextInt();
            }

            ArrayList<State> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(new State(t[i], d[i]));
            }
            Collections.sort(list);

            long max = 0;

            long score = 0;
            HashSet<Long> set = new HashSet<>();
//            int[] count2 = new int[N];
            HashMap<Long, Integer> count2 = new HashMap<>();
            ArrayList<Integer> indexes = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                State poll = list.get(i);
//                Utils.debug(poll.t, poll.d);

                if (i < K) {
                    if (set.contains(poll.t)) {
                        indexes.add(i);
                    }
                } else {
                    if (set.contains(poll.t)) {
                        continue;
                    }

                    boolean remove = false;
                    for (int j = indexes.size() - 1; j >= 0; j--) {
                        State state = list.get(indexes.get(j));
                        indexes.remove(j);
                        if (count2.get(state.t) > 1) {
                            score -= state.d;
                            count2.put(state.t, count2.get(state.t) - 1);
                            remove = true;
                            break;
                        }
                    }
                    if (!remove) {
                        continue;
                    }

                }

                score += poll.d;
                count2.put(poll.t, 1 + (count2.get(poll.t) == null ? 0 : count2.get(poll.t).intValue()));
                set.add(poll.t);

                max = Math.max(max, score + set.size() * set.size());
//                Utils.debug(score, set.size(), max);
            }

            System.out.println(max);
        }
    }

}

class State implements Comparable<State> {
    long t;
    long d;

    public State(long t, long d) {
        super();
        this.t = t;
        this.d = d;
    }

    @Override
    public int compareTo(State o) {
        if (d > o.d) {
            return -1;
        }
        if (d < o.d) {
            return 1;
        }
        return 0;
    }
}
