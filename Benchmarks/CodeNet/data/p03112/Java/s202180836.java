import java.util.*;

public class Main {
    
    static int A;
    static int B ;
    static int Q;
    
    static long[] s;
    static long[] t;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        Q = sc.nextInt();
        
        s = new long[A+2];
        t = new long[B+2];
        
        s[0] = 0L;
        for(int i = 1; i <= A; i++){
            s[i] = sc.nextLong();
        }
        s[A+1] = (long)1e10 + 5L;
        
        t[0] = 0L;        
        for(int i = 1; i <= B; i++){
            t[i] = sc.nextLong();
        }
        t[B+1] = (long)1e10 + 5L;        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Q; i++){
            long x = sc.nextLong(); 
            sb.append( minDistance(x) ).append("\r\n");
        }
        System.out.println(sb.toString());
    }
    
    static long minDistance(long x){
        
        int left = -1;
        int right = A+1;
        
        while(right - left > 1){
            int mid = (right + left) / 2;
            if( x < s[mid]) right = mid;
            if( s[mid] <= x) left = mid;
        }
        
        long minDistance = Long.MAX_VALUE;
        if( 0 < left ){
            long minL = minDistanceL(x, left);
            minDistance = Math.min(minDistance, minL);
        }
        if( right < A+1){
            long minR = minDistanceR(x, right);
            minDistance = Math.min(minDistance, minR);
        }
        
        return minDistance;
    }
    
    static long minDistanceL(long x, int sleft){
        
        int left = -1;
        int right = B+1;
        
        while( right - left > 1 ){
            int mid = (right + left) / 2;
            if( x < t[mid] ) right = mid;
            if( t[mid] <= x) left = mid;
        }
        
        if( 0 < left && s[sleft] <= t[left] ){
            return x - s[sleft];
        }
        
        long minDistanceL = Long.MAX_VALUE;
        if( 0 < left) {
            minDistanceL = Math.min(minDistanceL, x - t[left]);
        }
        
        if( right < B+1){
            long X = Math.min( t[right] - x, x - s[sleft] );
            minDistanceL = Math.min(minDistanceL, t[right] - s[sleft] + X);
        }
        
        return minDistanceL;
    }
    
    static long minDistanceR(long x, int sright){
        
        int left = -1;
        int right = B+1;
        
        while( right - left > 1 ){
            int mid = (right + left) / 2;
            if( x < t[mid] ) right = mid;
            if( t[mid] <= x) left = mid;
        }
        
        if( right < B+1 && t[right] <= s[sright] ){
            return s[sright] - x;
        }
        
        long minDistanceR = Long.MAX_VALUE;
        if( 0 < left) {
            long X = Math.min( s[sright] - x, x - t[left] );
            minDistanceR = Math.min(minDistanceR, s[sright] - t[left] + X);
        }
        
        if( right < B+1){
            minDistanceR = Math.min(minDistanceR, t[right] - x);
        }
        
        return minDistanceR;
    }    
}
