import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] chars = sc.next().toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            Integer cnt = map.get(s);
            if (cnt == null) {
                cnt = 0;
            }
            map.put(s, cnt + 1);
        }
        for (long num : map.values()) {
            ans += num * (num - 1) / 2;
        }
        System.out.println(ans);
    }
}