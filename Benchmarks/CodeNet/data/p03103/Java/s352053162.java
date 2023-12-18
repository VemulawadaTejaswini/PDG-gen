import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a, b);
        }
        long ans = 0;
        int count = 0;
        while(true) {
            Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
            for(Map.Entry<Integer, Integer> entry : entries) {
                int aa = entry.getKey();
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