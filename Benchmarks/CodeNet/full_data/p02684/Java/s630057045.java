import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            a[i] = sc.nextInt();
        }
        int dest = 1;

        Map<Integer, Integer> map = new HashMap<>();

        // find loop
        boolean isFound = false;
        int loop_num = 0;
        int loop_start_at_count = 0;
        int current_city = 1;
        int count = 1;
        int limit = 0;
        while (true) {
            if (limit > 100000 || limit == k) {
                break;
            }else {
                limit++;
            }
            if (map.containsKey(a[current_city])) {
                loop_start_at_count = map.get(a[current_city]);
                loop_num = count - map.get(a[current_city]);
                isFound = true;
                break;
            } else {
                map.put(a[current_city], count);
                //System.out.println("#"+a[current_city]+":"+ count);
                count++;
                current_city = a[current_city];
            }
        }
        //System.out.println(loop_start_at_count +" "+loop_num);
        //System.out.println(" isF "+isFound);

        long net_k = k;
        if (isFound) {
            if (k > loop_start_at_count) {
                net_k = ((k - loop_start_at_count)% loop_num) + loop_start_at_count;
            }
        }

        for (long i = 0; i < net_k; i++) {
            dest = a[dest];
        }

        // 出力
        System.out.println(dest);
    }
}