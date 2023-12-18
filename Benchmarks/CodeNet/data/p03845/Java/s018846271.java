import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] T = new int[N];
        long sum = 0;
        for(int i = 0; i < N; i++){
            T[i] = sc.nextInt();
            sum += T[i];
        }
        int M = sc.nextInt();
        int[][] P = new int[2][M];
        for(int i = 0; i < M; i++){
            P[0][i] = sc.nextInt();
            P[1][i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < M; i++){
            int a = P[0][i];
            System.out.println(sum - T[a-1] + P[1][i]);
        }

   }
}