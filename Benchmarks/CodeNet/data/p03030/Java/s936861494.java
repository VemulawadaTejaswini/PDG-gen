import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;

    public static class Restaurant {
        final int index;
        final String city;
        final Integer score;

        public Restaurant(
                final int index,
                final String city,
                final Integer score
        ) {
            this.index = index;
            this.city = city;
            this.score = score;
        }

        public int getIndex() {
            return index;
        }

        public String getCity() {
            return city;
        }

        public Integer getScore() {
            return score;
        }
    }

    public static void main(final String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            final int N = readInt();

            final List<Restaurant> restaurants = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                final Restaurant r = new Restaurant(i + 1, next(), readInt());
                restaurants.add(r);
            }

            final Solver solver = new Solver();
            solver.solve(restaurants);

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}

class Solver {
    public void solve(final List<Main.Restaurant> restaurants) {
        final Comparator<Main.Restaurant> compareByCity = Comparator.comparing(Main.Restaurant::getCity);
        final Comparator<Main.Restaurant> compareByScore = compareByCity.thenComparing(Main.Restaurant::getScore, Comparator.reverseOrder());
        Collections.sort(restaurants, compareByScore);

        for (final Main.Restaurant r : restaurants) {
            System.out.println(r.getIndex());
        }
    }
}
