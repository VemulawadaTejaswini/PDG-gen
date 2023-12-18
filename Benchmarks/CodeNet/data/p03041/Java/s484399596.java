import java.util.*;
class Main {
    public static void main(String[] args) {
        
        // Set variables.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int[] V = new int[N]; int[] C = new int[N];
        for(int i = 0; i < N; i++) { V[i] = sc.nextInt(); }
        for(int i = 0; i < N; i++) { C[i] = sc.nextInt(); }
        
        // Begin to calculate
        int ans = 0;
        for(int i = 0; i < N; i++){
            ans += Math.max(V[i] - C[i], 0);
        }
 
        // Output.
        System.out.println(ans);
    }
}