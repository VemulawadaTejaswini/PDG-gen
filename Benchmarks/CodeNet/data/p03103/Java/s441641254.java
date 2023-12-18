import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            int b = sc.nextInt();
            map.put(a, b);
        }
        long ans = 0l;
        int count = 0;
        while(true) {
            Set<Map.Entry<Long,Integer>> entries = map.entrySet();
            for(Map.Entry<Long, Integer> entry : entries) {
                long aa = entry.getKey();
                int bb = entry.getValue();
                for(int i = 0; i < bb; i++) {
                    if(count >= m) {
                        System.out.println(ans);
                        return;
                    }
                    ans += aa;
                    count++;
                }
            }
        }
    }
}