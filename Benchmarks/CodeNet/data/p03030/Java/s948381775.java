import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Restaurant[] r = new Restaurant[n];
        for (int i = 0; i < n; i++) {
            r[i] = new Restaurant(sc.next(), Integer.parseInt(sc.next()), i + 1);
        }

        Arrays.sort(r, (o1, o2) -> {
            int s = o1.s.compareTo(o2.s);
            if (s == 0) {
                return o2.p - o1.p;
            }
            return s;
        });

        for (Restaurant res : r) {
            System.out.println(res.n);
        }
    }

    public static class Restaurant {
        String s;
        int p;
        int n;

        public Restaurant(String s, int p, int n) {
            this.s = s;
            this.p = p;
            this.n = n;
        }
    }
}
