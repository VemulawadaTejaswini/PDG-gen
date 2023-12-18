import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] A = new int[2][N];
        for(int i = 0; i < N; i++){
            A[0][i] = sc.nextInt();
            A[1][i] = sc.nextInt();
        }
        sc.close();

        long count = 0;

        for(int i = N-1; i >= 0; i--){
            long mod = (A[0][i]+count) % A[1][i];
            if(mod != 0)
                count += A[1][i] - mod;
        }

        System.out.println(count);
    }
}