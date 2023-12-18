import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        
        int[] a = new int[N];
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }else {
                map.put(a[i], 1);
            }
        }
        int count = 0;
        int max = 0;
        for(int key : map.keySet()) {
            count = map.get(key);
            if(map.containsKey(key-1)) count += map.get(key-1);
            if(map.containsKey(key+1)) count += map.get(key+1);
            if(max < count) max = count;
            
        }
        
        System.out.println(max);
    }
}
