import java.util.*;

class Albeit {
    final int reward;
    final int days;

    Albeit(int days, int reward) {
        this.days = days;
        this.reward = reward;
    }

    boolean canEarn(int remaining) {
        return remaining > days;
    }
}

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Albeit> set = new TreeSet<>(Comparator.comparingInt((Albeit a) -> a.reward).reversed().thenComparingInt(a->a.days));
        for (int i = 0; i < N; i++) {
            set.add(new Albeit(sc.nextInt(), sc.nextInt()));
        }
        int sum = 0;
        for (int i = 1; i <= M + 1; i++) {
            int finalM = i;
            Optional<Albeit> max = set.stream().filter(a -> a.canEarn(finalM)).findFirst();
            max.ifPresent(set::remove);
            sum += max.map(a -> a.reward).orElse(0);
        }
        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}