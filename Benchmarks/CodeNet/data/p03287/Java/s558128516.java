import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        
        Map<Integer, Integer> amari = new HashMap<>();
        int[] sum = new int[N];
        
        for(int i = 0; i < N; i++){
            
            if( i == 0){
                sum[i] = A[i] % M;
            } else {
                long x = (long)A[i] % M + sum[i-1];
                x %= M;
                sum[i] = (int)x;
                
            }
            
            if( amari.containsKey(sum[i]) ){
                amari.put(sum[i], amari.get(sum[i])+1);
            } else {
                amari.put(sum[i], 1);
            }
        }
        
        long ans = amari.get(0);
        for(int i : amari.keySet() ){
            int x = amari.get(i);
            if( x >= 2 ) ans += (long) x * (x-1) / 2;
        }
        
        System.out.println(ans);
    }
}
