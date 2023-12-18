import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static class Dst
    {
        final int dst;
        final int cost;

        Dst(int dst, int cost)
        {
            this.dst = dst;
            this.cost = cost;
        }
    }

    private static class Hist
    {
        final int from;
        final int to;

        public Hist(int from, int to)
        {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Hist)) {
                return false;
            }

            Hist hist = (Hist) o;

            if (from != hist.from) {
                return false;
            }
            return to == hist.to;
        }

        @Override
        public int hashCode()
        {
            int result = from;
            result = 31 * result + to;
            return result;
        }
    }

    private static Integer walk(int cur, int cost, ArrayList<Integer> cities, ArrayList<Hist> hist, Map<Integer, List<Dst>> route)
    {
        cities.remove(Integer.valueOf(cur));

//System.out.println(String.format("cur=%d, cost=%d", cur, cost));
        if (cities.isEmpty()) {
//System.out.println("Goal");
            return cost;
        }

        if (!route.containsKey(cur)) {
            return null;
        }

        int minCost = Integer.MAX_VALUE;
        for (Dst next : route.get(cur)) {
            Hist newHist = new Hist(cur, next.dst);
            if (!hist.contains(newHist)) {
                ArrayList<Hist> newHistList = new ArrayList<>(hist);
                newHistList.add(newHist);
                Integer resultCost = walk(next.dst, cost + next.cost, new ArrayList<>(cities), newHistList, route);
                if (resultCost != null && resultCost < minCost) {
                    minCost = resultCost;
                }
            }
        }
        return minCost;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        ArrayList<Integer> cities = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            cities.add(sc.nextInt());
        }

        Map<Integer, List<Dst>> route = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            {
                List<Dst> dst = route.computeIfAbsent(a, k -> new ArrayList<>());
                dst.add(new Dst(b, c));
            }
            {
                List<Dst> dst = route.computeIfAbsent(b, k -> new ArrayList<>());
                dst.add(new Dst(a, c));
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int city : cities) {
            ArrayList<Integer> newCities = new ArrayList<>(cities);
            ArrayList<Hist> hist = new ArrayList<>();
            Integer cost = walk(city, 0, newCities, hist, route);
            if (cost != null && cost < minCost) {
                minCost = cost;
            }
        }
        System.out.println(minCost);
    }
}
