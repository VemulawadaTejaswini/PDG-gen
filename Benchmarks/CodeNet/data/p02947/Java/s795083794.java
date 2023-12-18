import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int n = sc.nextInt();
        Map<String, Long> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char[] ca = sc.next().toCharArray();
            Arrays.sort(ca);
            String s = String.valueOf(ca);
            if(map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1L);
        }
        for(String key : map.keySet()) {
            ans += map.get(key) * (map.get(key) - 1) / 2;
        }
        System.out.println(ans);
    }
}
