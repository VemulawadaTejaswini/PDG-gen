import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 5);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 3);
        map.put(8, 7);
        map.put(9, 6);
        Set<Integer> set = new HashSet<>();
        Set<Integer> candidates = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt();
            set.add(x);
            candidates.add(x);
        }
        for (int key : set) {
            if (key == 1) {
                candidates.remove(4);
                candidates.remove(9);
                candidates.remove(6);
            }
            if (key == 7) {
                candidates.remove(9);
                candidates.remove(6);
            }
            if (key == 9) {
                candidates.remove(6);
            }
            if (key == 5) {
                candidates.remove(3);
                candidates.remove(2);
            }
            if (key == 3) {
                candidates.remove(2);
            }
        }
        List<Pair> list = new ArrayList<>();
        for (int d : candidates) {
            list.add(new Pair(d, map.get(d)));
        }
        list.sort(new PairComparator());
        String ans = dfs(list, 0, N, new ArrayList<>());
        System.out.println(ans);
    }
    private String dfs(List<Pair> list, int current, int remain, List<Pair> answer) {
        if (remain == 0) {
            return ans(answer);
        }
        if (list.size() <= current) {
            return null;
        }
        Pair p = list.get(current);
        for (int i = remain / p.count; 0 <= i; i--) {
            answer.add(new Pair(p.d, i));
            String ans = dfs(list, current+1, remain - p.count * i, answer);
            if (ans != null) {
                return ans;
            }
            answer.remove(answer.size()-1);
        }
        return null;
    }
    private String ans(List<Pair> answer) {
        List<Integer> list = new ArrayList<>();
        for (Pair p : answer) {
            for (int i = 0; i < p.count; i++) {
                list.add(p.d);
            }
        }
        list.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int x : list) {
            sb.append(x);
        }
        return sb.toString();
    }
    class Pair {
        int d;
        int count;
        Pair (int d, int count) {
            this.d = d;
            this.count = count;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.count != o2.count) {
                return Integer.compare(o1.count, o2.count);
            }
            return -Integer.compare(o1.d, o2.d);
        }
    }
}
