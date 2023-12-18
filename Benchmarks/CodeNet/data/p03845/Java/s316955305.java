import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T = new int[N];
        int a = 0;
        
        for(int i=0; i<N; i++){
            T[i] = sc.nextInt();
            a += T[i];
        }

        int M = sc.nextInt();
        int[] P = new int[M];
        int[] X = new int[M];
        int[] ans = new int[M];

        for(int i=0; i<M; i++){
            P[i] = sc.nextInt();
            X[i] = sc.nextInt();
            ans[i] = a - T[P[i] - 1] + X[i];
            System.out.println(ans[i]);
        }
    }
}