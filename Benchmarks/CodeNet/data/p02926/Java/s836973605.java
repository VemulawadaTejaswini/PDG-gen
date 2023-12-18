import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            List<Engine> E1 = new ArrayList<>();
            List<Engine> E2 = new ArrayList<>();
            List<Engine> E3 = new ArrayList<>();
            List<Engine> E4 = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                Engine e = new Engine(x, y);

                if (x >= 0) {
                    if (y >= 0) {
                        E1.add(e);
                    } else {
                        E4.add(e);
                    }
                } else {
                    if (y >= 0) {
                        E2.add(e);
                    } else {
                        E3.add(e);
                    }
                }
            }

            double max = 0;
            double d;

            d = distance(E1, E2);
            if (max < d) {
                max = d;
            }

            d = distance(E1, E4);
            if (max < d) {
                max = d;
            }

            d = distance(E2, E1);
            if (max < d) {
                max = d;
            }

            d = distance(E2, E3);
            if (max < d) {
                max = d;
            }

            d = distance(E3, E2);
            if (max < d) {
                max = d;
            }

            d = distance(E3, E4);
            if (max < d) {
                max = d;
            }

            d = distance(E4, E1);
            if (max < d) {
                max = d;
            }
            d = distance(E4, E3);
            if (max < d) {
                max = d;
            }

            System.out.println(max);
        }
    }

    public static double distance(List<Engine> A, List<Engine> B) {
        long x = 0;
        long y = 0;
        for (Engine e : A) {
            x += e.x;
            y += e.y;
        }

        double max = Math.pow(x, 2) + Math.pow(y, 2);
        for (Engine e : B) {
            double d = Math.pow(x + e.x, 2) + Math.pow(y + e.y, 2);
            if (max < d) {
                max = d;
                x += e.x;
                y += e.y;
            }
        }

        return Math.sqrt(max);
    }

    public static class Engine {

        public long x;

        public long y;

        public Engine(long x, long y) {
            this.x = x;
            this.y = y;
        }

    }

}
