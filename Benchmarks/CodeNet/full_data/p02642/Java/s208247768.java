import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = A[i];
            List<Pair> primes = new ArrayList<>();
            for (int p = 2; p*p <= tmp; p++) {
                if (tmp%p != 0) continue;

                Pair pair = new Pair(p);
                while (tmp%p == 0) {
                    pair.cnt++;
                    tmp /= p;
                }
                primes.add(pair);
            }
            if (tmp != 1) primes.add(new Pair(tmp,1));
            /*
            for (Pair x : primes) {
                System.out.println(x.p + " " + x.cnt);
            }
            */
            map.put(A[i],map.get(A[i])-1);
            boolean found = find(primes, map, 0, 1);
            if (!found) {
                ans++;
            }
            map.put(A[i],map.get(A[i])+1);
        }

        System.out.println(ans);
    }

    private static boolean find(List<Pair> primes, Map<Integer,Integer> map, int now, int div) {

        if (now == primes.size()) {
            return div != 1 && map.get(div) != null && map.get(div) > 0;
        }

        Pair a = primes.get(now);
        int tmp = 1;
        for (int i = 0; i <= a.cnt; i++) {
            if (find(primes, map, now+1, div*tmp)) {
                return true;
            }
            tmp *= a.p;
        }
        return false;
    }

    private static class Pair {
        final int p;
        int cnt;
        Pair(int p) {
            this.p = p;
            this.cnt = 0;
        }
        Pair(int p, int cnt) {
            this.p = p;
            this.cnt = cnt;
        }
    }
}
