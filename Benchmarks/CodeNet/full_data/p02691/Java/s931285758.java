import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int a = (i+1) - num;
            
            if (!map1.containsKey(a)) {
                map1.put(a, 1);
            } else {
                int val = map1.get(a);
                map1.put(a, val + 1);
            }
            
            int b = num + (i+1);
            if (!map2.containsKey(b)) {
                map2.put(b, 1);
            } else {
                int val = map2.get(b);
                map2.put(b, val + 1);
            }
        }
        
        long count = 0;
        for (Integer key : map2.keySet()) {
            // System.out.println(key);
            if (!map1.containsKey(key)) continue;
            
            int val1 = map1.get(key);
            int val2 = map2.get(key);
            
            count += (long)val1 * val2;
        }
        System.out.println(count);
    }
}
