import java.util.Scanner;
import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> guu = new HashMap<>();
        Map<Integer, Integer> kisu = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (i % 2 == 0) {
                if (guu.containsKey(x)) {
                    guu.put(x, guu.get(x) + 1);
                    continue;
                }
                guu.put(x, 1);
                continue;
            }
            if (kisu.containsKey(x)) {
                kisu.put(x, kisu.get(x) + 1);
                continue;
            }
            kisu.put(x, 1);
        }
        List<Entry<Integer, Integer>> list_entries =
            new ArrayList<Entry<Integer, Integer>>(guu.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        List<Entry<Integer, Integer>> list_entries2 =
            new ArrayList<Entry<Integer, Integer>>(kisu.entrySet());
        Collections.sort(list_entries2, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        int max = 0;
        int cnt = 0;
        if (list_entries.get(0).getKey() == list_entries2.get(0).getKey()) {
            if (list_entries.get(0).getValue() >= list_entries2.get(0).getValue()) {
                max = list_entries.get(0).getValue();
                cnt += n / 2 - max;
                if (list_entries2.size() == 1) {
                    cnt += n / 2;
                } else {
                    cnt += n / 2 - list_entries2.get(1).getValue();
                }
            }
            if (list_entries.get(0).getValue() < list_entries2.get(0).getValue()) {
                max = list_entries2.get(0).getValue();
                cnt += n / 2 - max;
                cnt += n / 2 - list_entries.get(1).getValue();
            }
            System.out.println(cnt);
            return;
        }
        cnt += n / 2 - list_entries.get(0).getValue();
        cnt += n / 2 - list_entries2.get(0).getValue();
        System.out.println(cnt);
    }
}
