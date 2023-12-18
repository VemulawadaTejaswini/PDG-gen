import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;
        for(int i=0; i<n; i++) {
            a =Integer.parseInt(sc.next());
            if(map.containsKey(a)) map.put(a, map.get(a)+1);
            else map.put(a, 1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int x : map.values()) {
            if(x > 1) list.add(x-1);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        long ans = 0;
        for(int x : list) {
            if(ans == 0) ans += x;
            else ans = Math.abs(ans-x);
        }
        System.out.println(map.size()-ans);
     }
}