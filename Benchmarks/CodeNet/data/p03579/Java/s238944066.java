import java.util.*;

public class Main {
    private class City {
        Boolean flg = null;
        List<Integer> dsts = new ArrayList<>();
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        City city[] = new City[n];
        for (int i = 0; i < n; i++) {
            city[i] = new City();
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int src = sc.nextInt() - 1;
            int dst = sc.nextInt() - 1;
            city[src].dsts.add(dst);
            city[dst].dsts.add(src);
        }

        city[0].flg = true;
        Queue<City> queue = new ArrayDeque<>();
        queue.add(city[0]);

        boolean is2bunki = true;
        while (is2bunki && !queue.isEmpty()) {
            City c = queue.poll();
            for (Integer dst : c.dsts) {
                if (city[dst].flg == null) {
                    city[dst].flg = !c.flg;
                    queue.add(city[dst]);
                } else if (city[dst].flg == c.flg) {
                    is2bunki = false;
                    break;
                }
            }
        }

        if (is2bunki) {
            long r = 0;
            long b = 0;
            for (int i = 0; i < n; i++) {
                if (city[i].flg) {
                    r++;
                } else {
                    b++;
                }
            }
            System.out.println(r * b - m);
        } else {
            long nn = n;
            System.out.println(nn * (nn - 1) / 2 - m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
