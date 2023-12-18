import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] b = new int[N];
        long sum = 0;
        Map<Integer, Long> map = new TreeMap<>();
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+b[i]);
            else map.put(a[i], (long)b[i]);
        }
        
        for(int i : map.keySet()) {
            sum += map.get(i);
            if(sum >= K) {
                System.out.println(i);
                break;
            }
        }
        
    }   
}
