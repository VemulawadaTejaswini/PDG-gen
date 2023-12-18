import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] B = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(sc.next());
            B[i] = Integer.parseInt(sc.next());
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]+B[i]));
            }else {
                map.put(A[i], B[i]);
            }
        }
        
        Object[] key = map.keySet().toArray();
        Arrays.sort(key);
        
        int sum = 0;
        for(int k : map.keySet()) {
            if(M > map.get(k)) {
                sum += k * map.get(k);
            }else {
                sum += k * M;
            }
            M -= map.get(k);
        }
        System.out.println(sum);
        
    }
}