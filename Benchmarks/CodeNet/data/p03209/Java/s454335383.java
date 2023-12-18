import java.util.*;

class Main {
    class EatState {
        private long toEat;
        private long pati;

        public EatState(long eat, long pati) {
            this.toEat = eat;
            this.pati = pati;
        }

        public long toEat() {
            return this.toEat;
        }

        public long pati() {
            return this.pati;
        }
    }

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ", 2);
        long n = Integer.parseInt(line[0]);
        long x = Integer.parseInt(line[1]);

        EatState state = eat(n, new EatState(x, 0));
        System.out.println(state.pati());
    }

    public EatState eat(long level, EatState state) {
        if (state.toEat() == 0) {
            return state;
        }

        if (level == 0) {
            return new EatState(state.toEat() - 1, state.pati() + 1);
        } else {
            long toEat = state.toEat();
            long pati = state.pati();
            toEat--; // ban

            if (toEat > 0) { // level - 1 burger
                state = this.eat(level - 1, new EatState(toEat, pati));
                toEat = state.toEat();
                pati = state.pati();
            }
            if (toEat > 0) { // pati
                toEat--;
                pati++;
            }
            if (toEat > 0) { // level - 1 burger
                state = this.eat(level - 1, new EatState(toEat, pati));
                toEat = state.toEat();
                pati = state.pati();
            }
            if (toEat > 0) { // ban
                toEat--;
            }
            return new EatState(toEat, pati);
        }
    }
}
