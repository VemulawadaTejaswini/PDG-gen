import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();

        final PriorityQueue<Pair> queue
                = new PriorityQueue<>(Comparator.comparingInt(Pair::getA));
        for(int i = 0 ; i < N ; i++){
            queue.add(new Pair(sc.nextInt(), i + 1));
        }

        final Solver solver = new Solver();
        solver.solve(queue);
    }
}

class Pair {
    final private int a;
    final private int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        final Pair pair = (Pair) o;
        return getA() == pair.getA() &&
                getB() == pair.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }
}

class Solver {
    public void solve(PriorityQueue<Pair> queue) {
        final List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            final Pair p = queue.poll();
            ans.add(p.getB());
        }

        System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

