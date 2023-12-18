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
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        int tmp = 0;
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i).getValue();
            int key = list.get(i).getKey();
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
