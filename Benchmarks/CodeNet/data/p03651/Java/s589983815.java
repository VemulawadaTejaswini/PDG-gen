import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            max = Math.max(max, A[i]);
        }
        sc.close();

        if(max < K)
            System.out.println("IMPOSSIBLE");
        else {
            int[] g = new int[N];
            g[0] = A[0];
            for(int i = 1; i < N; i++){
                g[i] = gcd(A[i], g[i-1]);
            }
            if(K % g[N-1] == 0)
                System.out.println("POSSIBLE");
            else
                System.out.println("IMPOSSIBLE");
        }
    }
    
    static int gcd(int n, int m){
        if(m>n)
            return gcd(m, n);
        else {
            if(n%m == 0)
                return m;
            else
                return gcd(m, n%m);
        }
    }
}