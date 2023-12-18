import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> keys = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
            keys.add(num);
        }
        int count = 0;
        Integer[] k = keys.toArray(new Integer[keys.size()]);
        for(Integer key: k) {
            int value = map.get(key);
            if(value > key) count += (value - key);
            if(value < key) count += value;
        }
        System.out.println(count);
    }
}