import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Set<Integer>[] switches = new Set[N];
        for(int i = 0; i < N; i++){
            switches[i] = new HashSet<>();
        }
        
        for(int i = 0; i < M; i++){
            int k = sc.nextInt();
            
            for(int j = 0; j < k; j++){
                int s = sc.nextInt() - 1;
                switches[s].add(i);
            }
        }
        
        int[] P = new int[M];
        for(int i = 0; i < M; i++){
            P[i] = sc.nextInt();
        }
        
        
        int sum = 0;
        for(int i = 0; i < 1 << N; i++){
            
            int x = i;
            int X = i;
            int[] check = new int[M];
            
            for(int j = 0; j < N; j++){
                
                if( (x & 1) == 1 ){
                    for( int mame : switches[j] ){
                        check[mame]++;
                    }
                }
                
                x >>= 1;
            }
            
            boolean isOK = true;
            for(int j = 0; j < M; j++){
                if( check[j] % 2 != P[j] ){
                    isOK = false;
                    break;
                }
            }
            
            if(isOK){
                sum++;
            }
        }
        
        System.out.println(sum);
    }
}
