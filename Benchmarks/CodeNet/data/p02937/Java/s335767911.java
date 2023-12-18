import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] s_hist = new int[26];
        int[] t_hist = new int[26];
        String s = scan.next();
        String t = scan.next();
        char[] s_d = s.toCharArray();
        char[] t_d = t.toCharArray();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s_d.length; i++) {
            if (!map.containsKey(s_d[i])) {
                map.put(s_d[i], new ArrayList());
            }
            map.get(s_d[i]).add(i);
        }
        Map<Character, Integer[]> search_map = new HashMap<>();
        for (char x : map.keySet()) {
            List<Integer> list = map.get(x);
            search_map.put(x, list.toArray(new Integer[list.size()]));
        }
        int search_target = 0;
        Comparator<Integer> c = new LowerBoundComparator<>();
        long turn = 0;
        long remain = 0;
        for (int i = 0; i < t_d.length; i++) {
            boolean found = false;
            remain = 0;
            while (!found) {
                Integer[] list = search_map.get(t_d[i]);
                if (list == null) {
                    System.out.println(-1);
                    return;
                }
                int search_index = ~Arrays.binarySearch(list, search_target, c);
                if (list.length <= search_index) {
                    search_target = 0;
                    turn += s_d.length;
                } else {
                    search_target = list[search_index] + 1;
                    remain = list[search_index];
                    found = true;
                }
            }
        }
        System.out.println(turn + remain + 1);
    }
    class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
        public int compare(T x, T y) {
            return (x.compareTo(y) >= 0) ? 1 : -1;
        }
    }
}
