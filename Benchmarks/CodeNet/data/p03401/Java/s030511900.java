import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+2];
        
        A[0] = 0;
        for(int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        A[N+1] = 0;
        
        int sum = 0;
        for(int i = 1; i <= N+1; i++) {
            sum += (int) Math.abs( A[i] - A[i-1] );
        }
        
        for(int i = 1; i <= N; i++) {
            int x = (int)Math.abs( A[i] - A[i-1] ) + (int)Math.abs( A[i+1] - A[i] );
            int y = (int)Math.abs( A[i+1] - A[i-1] );
            System.out.println( sum - x + y );
        }
    }
}
