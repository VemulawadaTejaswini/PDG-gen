import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Period {
        int s;
        int e;

        public Period(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), C = scanner.nextInt();
        scanner.nextLine();
        List<TreeSet<Period>> m = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            m.add(new TreeSet<>(Comparator.comparingInt(x -> x.s)));
        }
        for (int i = 0; i < N; i++) {
            int s = scanner.nextInt(), t = scanner.nextInt(), c = scanner.nextInt() - 1;
            scanner.nextLine();
            m.get(c).add(new Period(s, t));
        }

        int[] imos = new int[10_001];
        for (TreeSet<Period> s : m) {
            int pe = -1;
            for (Period p : s) {
                if (pe == -1) {
                    imos[p.s]++;
                    pe = p.e;
                } else {
                    if (pe != p.s) {
                        imos[pe + 1]--;
                        imos[p.s]++;
                    }
                    pe = p.e;
                }
            }
            if (pe != -1) {
                imos[pe + 1]--;
            }
        }

        int ans = 0;
        for (int i = 1; i < 10_001; i++) {
            imos[i] += imos[i - 1];
            ans = Math.max(ans, imos[i]);
        }

        // System.out.println(Arrays.toString(imos));
        System.out.println(ans);
    }

}