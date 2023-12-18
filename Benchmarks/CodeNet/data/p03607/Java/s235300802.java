import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            long key = sc.nextLong();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        int ans = 0;
        for(Entry<Long, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}