import java.util.*;

public class Main {
    
    static int[] L;
    static int N;
    static int A;
    static int B;
    static int C;
    static int minMP = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        L = new int[N];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        
        dfs(0, 0, 0, 0, 0);
        
        System.out.println(minMP);
        
    }
    
    static void dfs(int a, int b, int c, int i, int cost){
        
        if( i == N ){
            if( a == 0 || b == 0 || c == 0 ) return;
            cost -= 30;
            cost += Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c);
            minMP = Math.min(minMP, cost);
            return;
        }
        
        dfs(a, b, c, i+1, cost);
        dfs(a+L[i], b, c, i+1, cost+10);
        dfs(a, b+L[i], c, i+1, cost+10);
        dfs(a, b, c+L[i], i+1, cost+10);
        
    }
}
