import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int[] distances = new int[N];
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            distances[i] = Math.abs(X - x);
        }
        
        int ans = distances[0];
        for(int i = 1; i < N; i++){
            ans = gcd(ans, distances[i]);
        }
        
        System.out.println(ans);
    }
    
    static int gcd(int a, int b){
        if( b == 0 ) return a;
        return gcd(b, a%b);
    }
}
