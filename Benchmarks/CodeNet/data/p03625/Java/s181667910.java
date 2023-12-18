import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int area = 1, count = 2;
        Iterator entries = map.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry entry = (Map.Entry)entries.next();
            int value = (Integer)entry.getValue();
            while(value >= 2 & count != 0) {
                area *= (Integer) entry.getKey();
                value -= 2;
                count--;
            }
            if(count == 0) break;
        }
        if(count == 0) {
            System.out.println(area);
        } else {
            System.out.println(0);
        }
    }
}