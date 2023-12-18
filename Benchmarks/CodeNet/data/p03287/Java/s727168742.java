import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long M = sc.nextLong();
        
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        Map<Long, Integer> amari = new HashMap<>();
        long[] sum = new long[N];
        
        for(int i = 0; i < N; i++){
            
            if( i == 0){
                sum[i] = A[i] % M;
            } else {
                sum[i] = A[i] % M + sum[i-1];
                sum[i] %= M;
            }
            
            if( amari.containsKey(sum[i]) ){
                amari.put(sum[i], amari.get(sum[i])+1);
            } else {
                amari.put(sum[i], 1);
            }
        }
        
        long ans = 0;
        for(long i : amari.keySet() ){
            long x = amari.get(i);
            if( i == 0 ) ans += x;            
            if( x >= 2 ) ans += x * (x-1) / 2;
        }
        
        System.out.println(ans);
    }
}
