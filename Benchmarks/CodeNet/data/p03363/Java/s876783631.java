import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0L;
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(0L, 1);
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            s += sc.nextLong();
            if(map.containsKey(s)) ans += map.get(s);
            if(!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }
        System.out.println(ans);
        sc.close();

    }

}
