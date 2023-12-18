import java.util.*;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final Queue<Dish> eatQueue = new PriorityQueue<>(Comparator.<Dish>comparingInt(dish -> dish.getA() + dish.getB()).reversed());
        for (int i = 0; i < n; i++) {
            final Dish dish = new Dish(scanner.nextInt(), scanner.nextInt());
            eatQueue.add(dish);
        }

        boolean isTurnOnTakahashi = true;
        long takahashi = 0;
        long aoki = 0;
        while (!eatQueue.isEmpty()) {
            final Dish d = eatQueue.remove();
            if (isTurnOnTakahashi) {
                takahashi += d.getA();
            } else {
                aoki += d.getB();
            }
            isTurnOnTakahashi = ! isTurnOnTakahashi;
        }

        System.out.print(takahashi - aoki);

    }

    static class Dish {
        private final int a;
        private final int b;
        public Dish(final int a, final int b) {
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dish dish = (Dish) o;
            return a == dish.a &&
                    b == dish.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public String toString() {
            return "Dish{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

}
