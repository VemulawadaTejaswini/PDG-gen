import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        var hm = new HashMap<Integer, Integer>();
        var wm = new HashMap<Integer, Integer>();
        var mm = new HashSet<String>();
        for (int i = 0; i < m; i++) {
            int hh = Integer.parseInt(sc.next());
            int ww = Integer.parseInt(sc.next());
            hm.merge(hh - 1, 1, Integer::sum);
            wm.merge(ww - 1, 1, Integer::sum);
            mm.add(hh + " " + ww);
        }
        long ans = 0;
        var ah = sortByValue(hm);
        var aw = sortByValue(wm);
        int maxh = 0;
        var listh = new ArrayList<Integer>();
        int maxw = 0;
        var listw = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> e : ah.entrySet()) {
            int temp = e.getValue();
            if (temp < maxh) {
                break;
            }
            maxh = temp;
            listh.add(e.getKey());
        }
        for (Map.Entry<Integer, Integer> e : aw.entrySet()) {
            int temp = e.getValue();
            if (temp < maxw) {
                break;
            }
            maxw = temp;
            listw.add(e.getKey());
        }
        for (int i = 0; i < listh.size(); i++) {
            for (int j = 0; j < listw.size(); j++) {
                if (!mm.contains((listh.get(i) + 1) + " " + (listw.get(j) + 1))) {
                    System.out.println(maxh + maxw);
                    return;
                }
            }
        }
        System.out.println(maxh + maxw - 1);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}