import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long key = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        List<Entry<Long, Integer>> list = new ArrayList<Entry<Long, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<Long, Integer>>() {
            public int compare(Entry<Long, Integer> obj1, Entry<Long, Integer> obj2) {
                return obj2.getKey().compareTo(obj1.getKey());
            }
        });
        long tmp = 0l;
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i).getValue();
            long key = list.get(i).getKey();
            if(value >= 4) {
                if(tmp != 0) {
                    System.out.println(tmp * key);
                } else {
                    System.out.println(key * 2);
                }
                return;
            } else if(value >= 2) {
                if(tmp != 0) {
                    System.out.println(tmp * key);
                    return;
                } else {
                    tmp = key;
                }
            }
        }
        System.out.println(0);
    }
}
