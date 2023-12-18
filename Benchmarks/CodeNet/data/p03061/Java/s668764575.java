import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int[] gcdL = new int[N];
        int[] gcdR = new int[N];
        
        gcdL[0] = A[0];
        for(int i = 1; i < N-1; i++){
            gcdL[i] = GCD(gcdL[i-1], A[i]);
        }
        
        gcdR[N-1] = A[N-1];
        for(int i = N-2; i >= 1; i--){
            gcdR[i] = GCD(gcdR[i+1], A[i]);
        }
        
        int maxGCD = 1;
        for(int i = 0; i < N; i++){
            
            if ( i == 0 ){
                maxGCD = Math.max(maxGCD, gcdR[i+1]);
                continue;
            } 
            if ( i == N - 1){
                maxGCD = Math.max(maxGCD, gcdL[N-2]);
                continue;
            }
            
            maxGCD = Math.max(maxGCD, GCD(gcdL[i-1], gcdR[i+1]) );
        }
        
        System.out.println(maxGCD);
        
    }
    
    public static int GCD(int x, int y){
        if( y == 0 ) return x;
        return GCD( y, x % y );
    }
}
