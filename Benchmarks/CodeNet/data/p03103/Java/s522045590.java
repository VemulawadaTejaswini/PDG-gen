import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long[] A = new long[N];
        int[] B = new int[N];
        Map<Long, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            A[i] = Long.parseLong(sc.next());
            B[i] = Integer.parseInt(sc.next());
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+B[i]);
            }else {
                map.put(A[i], B[i]);
            }
        }
        
        Object[] key = map.keySet().toArray();
        Arrays.sort(key);
        int bin = M;
        long sum = 0;
        for(long k : map.keySet()) {
            if(bin <= 0) {
                break;
            }
            if(bin > map.get(k)) {
                sum += k * map.get(k);
            }else if(bin > 0){
                sum += k * bin;
                bin = 0;
                break;
            }else {
                break;
            }
            bin -= map.get(k);
            
        }
        System.out.println(sum);
        
    }
}