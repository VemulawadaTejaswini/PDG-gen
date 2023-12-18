import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.function.IntFunction;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETwoCurrencies solver = new ETwoCurrencies();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETwoCurrencies {
        private ETwoCurrencies.MyVertex[] cities;
        private int initialMoney;
        private boolean[][] done;
        private int max;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int nbCities = in.nextInt();
            int nbEdges = in.nextInt();
            initialMoney = in.nextInt();
            cities = new ETwoCurrencies.MyVertex[nbCities];
            arraysSetAll(cities, p -> new ETwoCurrencies.MyVertex());
            for (int i = 0; i < nbEdges; i++) {
                ETwoCurrencies.MyVertex city1 = cities[in.nextInt() - 1];
                ETwoCurrencies.MyVertex city2 = cities[in.nextInt() - 1];
                int cost = in.nextInt();
                int nbMinutes = in.nextInt();
                city1.next.add(new ETwoCurrencies.MyEdge(city2, cost, nbMinutes));
                city2.next.add(new ETwoCurrencies.MyEdge(city1, cost, nbMinutes));
            }
            for (int i = 0; i < nbCities; i++) {
                cities[i].nbSilversPerGold = in.nextInt();
                cities[i].minutesPerGold = in.nextInt();
                cities[i].cityId = i;
            }

            solveMe();

            for (ETwoCurrencies.MyVertex city : cities) {
                if (city.cityId == 0)
                    continue;
                out.println(city.reachedIn);
            }

            //out.print("Case #"+ testNumber + ": ");
        }

        private void solveMe() {

            PriorityQueue<ETwoCurrencies.MyState> list = new PriorityQueue<>((s1, s2) -> s1.t != s2.t ? Long.compare(s1.t, s2.t) : Long.compare(s2.money, s1.money));
            cities[0].reachedIn = 0L;
            int nbReached = 1;
            max = 50 * cities.length;
            done = new boolean[cities.length][max + 1];
            addMe(list, 0, Math.min(max, initialMoney), 0);

            while (!list.isEmpty() && nbReached < cities.length) {
                //d("list = " + stringMeDeb(list.toArray(new MyState[0])));
                ETwoCurrencies.MyState best = list.remove();
                if (best.city.reachedIn == null) {
                    best.city.reachedIn = best.t;
                    nbReached++;
                }
                addMe(list, best.city.cityId, best.money + best.city.nbSilversPerGold, best.t + best.city.minutesPerGold);
                for (ETwoCurrencies.MyEdge edge : best.city.next) {
                    if (best.money >= edge.cost) {
                        addMe(list, edge.cityId.cityId, best.money - edge.cost, best.t + edge.nbMinutes);
                    }
                }
            }
        }

        private void addMe(PriorityQueue<ETwoCurrencies.MyState> list, int cityId, int money, long t) {
            money = Math.min(max, money);
            if (!done[cityId][money]) {
                list.add(new ETwoCurrencies.MyState(cities[cityId], money, t));
                done[cityId][money] = true;
            }
        }

        public static <T> void arraysSetAll(T[] a, IntFunction<? extends T> generator) {
            Arrays.setAll(a, generator);
        }

        private static class MyVertex {
            int nbSilversPerGold;
            int minutesPerGold;
            List<ETwoCurrencies.MyEdge> next = new ArrayList<>();
            Long reachedIn;
            int cityId;

            public MyVertex(int cityId, int nbSilversPerGold, int minutesPerGold) {
                this.cityId = cityId;
                this.nbSilversPerGold = nbSilversPerGold;
                this.minutesPerGold = minutesPerGold;
            }

            public MyVertex() {

            }

        }

        private static class MyEdge {
            ETwoCurrencies.MyVertex cityId;
            int cost;
            int nbMinutes;

            public MyEdge(ETwoCurrencies.MyVertex cityId, int cost, int nbMinutes) {
                this.cityId = cityId;
                this.cost = cost;
                this.nbMinutes = nbMinutes;
            }

        }

        public static class MyState {
            ETwoCurrencies.MyVertex city;
            int money;
            long t;

            public MyState(ETwoCurrencies.MyVertex city, int money, long t) {
                this.city = city;
                this.money = money;
                this.t = t;
            }

            public String toString() {
                return "MyState{" +
                        "city=" + city.cityId +
                        ", money=" + money +
                        ", t=" + t +
                        '}';
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

