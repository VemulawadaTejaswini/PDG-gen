import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] s = new long[n];
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        s[0] = sc.nextLong();
        map.put(s[0], 1);
        for (int i = 1; i < n; i++) {
            s[i] = s[i-1] + sc.nextLong();
            if(!map.containsKey(s[i])) map.put(s[i], 1);
            else map.put(s[i], map.get(s[i]) + 1);
        }
        long ans = 0L;
        for(Entry<Long, Integer> e : map.entrySet()){
            if(1 < e.getValue()){
                ans += e.getValue() * (e.getValue()-1) / 2;
            }
            if(e.getKey() == 0){
                ans += e.getValue();
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
