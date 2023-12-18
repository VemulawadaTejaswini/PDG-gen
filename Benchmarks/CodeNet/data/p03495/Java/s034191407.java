import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            if (m.containsKey(now)) {
                m.put(now, m.get(now) + 1);
            } else {
                m.put(now, 1);
            }
            set.add(now);
        }

        for (Integer i : m.values()) {
            sum += i;
        }

        List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(m.entrySet());

        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                // 4. 昇順
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

        sum = set.size();
        if (sum <= K) {
            System.out.println(0);
        } else {
            int i = 0;
            int cnt = 0;
            while (true) {
                sum--;
                cnt += list_entries.get(i).getValue();
                i++;
                if (sum <= K) {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
