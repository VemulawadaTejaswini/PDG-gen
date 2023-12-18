import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        long x[] = new long[N];
        long y[] = new long[N];
        long z[] = new long[N];
        for(int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        
        long max = Long.MIN_VALUE;
        for( int i = 0; i < (1<<3); i++ ) {
            PriorityQueue<Long> pq = new PriorityQueue<Long>( (a, b) -> b.compareTo(a) );
            for(int j = 0; j < N; j++ ) {
                long sum = 0;
                if( (i>>0 & 1) == 1 ) {
                    sum += x[j];
                } else {
                    sum -= x[j];
                }
                
                if( (i>>1 & 1) == 1 ) {
                    sum += y[j];
                } else {
                    sum -= y[j];
                }
                
                if( (i>>2 & 1) == 1 ) {
                    sum += z[j];
                } else {
                    sum -= z[j];
                }
                pq.add( sum );
            }
            
            long total = 0;
            for(int k = 0; k < M; k++) {
                long v = pq.poll();
                total += v;
            }
            max = Math.max( max, total );
        }

        System.out.println( max );
    }
}
