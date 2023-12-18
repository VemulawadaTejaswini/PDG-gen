import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long,Long> map = new HashMap<>();
        ArrayList<Long> a = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < n; i++) {
            long key = sc.nextLong();
            a.add(key);
            if(map.containsKey(key)) {
                sum += map.get(key);
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1l);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(sum - (map.get(a.get(i)) - 1));
        }
    }
}
