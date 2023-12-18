import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Creature {
    final int size;
    final int color;

    Creature(int size, int color) {
        this.size = size;
        this.color = color;
    }
}

class Solver {

    private final PriorityQueue<Creature> creatures;

    Solver(Scanner in) {
        int N = in.nextInt();
        creatures = new PriorityQueue<>(Comparator.comparingInt((Creature c) -> c.size));
        for (int i = 0; i < N; i++) {
            creatures.add(new Creature(in.nextInt(), i));
        }
    }

    void solve() {
        Creature s = creatures.remove();
        int streak = 0;
        int size = 0;
        for (; s != null; s = creatures.poll()) {
            if (size * 2 < s.size) {
                streak = creatures.size();
            }
            size += s.size;
        }
        System.out.println(streak + 1);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}