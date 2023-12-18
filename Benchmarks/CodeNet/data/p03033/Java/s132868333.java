import java.io.*;
import java.util.*;

public class Main {

    public enum EventType {
        INSERT,
        DELETE
    }
    public static class Event {
        final long time;
        final EventType type;
        final long x;

        public Event(final long time, final EventType type, final long x) {
            this.time = time;
            this.type = type;
            this.x = x;
        }
    }

    public static class Start {
        final int index;
        final long time;

        public Start(final int index, final long time) {
            this.index = index;
            this.time = time;
        }
    }

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long Q;
        Q = sc.nextLong();
        final List<Event> events = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            long S = sc.nextLong();
            long T = sc.nextLong();
            long X = sc.nextLong();

            events.add(new Event(S - X, EventType.INSERT, X));
            events.add(new Event(T - X, EventType.DELETE, X));
        }

        final Set<Start> starts = new TreeSet<>(Comparator.comparingLong(s -> s.time));
        for(int i = 0 ; i < Q ; i++){
            starts.add(new Start(i, sc.nextLong()));
        }

        final Solver solver = new Solver();
        solver.solve(N, Q, events, starts);
    }
}

class Solver {
    public void solve(long N, long Q, List<Main.Event> events, final Set<Main.Start> starts) {
        events.sort(Comparator.comparingLong(e -> e.time));

        long[] ANS = new long[(int)(Q)];

        int eventIndex = 0;
        final TreeSet<Long> blocks = new TreeSet<>();
        for (final Main.Start start : starts) {
            for (; eventIndex < events.size(); eventIndex++) {
                final Main.Event event = events.get(eventIndex);
                if (event.time > start.time) {
                    break;
                }

                if (event.type == Main.EventType.INSERT) {
                    blocks.add(event.x);
                } else {
                    blocks.remove(event.x);
                }
            }

            ANS[start.index] = blocks.isEmpty() ? -1 : blocks.first();
        }

        for (final long ans : ANS) {
            System.out.println(ans);
        }
    }
}

