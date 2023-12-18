import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        long[] a = new long[N];
        for(int i=0; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(a);
        
        long ans = 100000000;
        for(int i=0; i<N-K+1; i++) {
            long max = a[i];
            long min = a[i];
            for(int j=1; j<K; j++) {
                if(a[i+j] > max) max = a[i+j];
                if(a[i+j] < min) min = a[i+j];
            }
            if(ans > max - min) ans = max-min;
            if(ans == 0) break;
        }
        System.out.println(ans);
    }
    
    
}