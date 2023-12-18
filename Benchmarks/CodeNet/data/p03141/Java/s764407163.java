import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] A = new int[2][N];
        int[] sum = new int[N];
        long sum1 = 0;
        for(int i = 0; i < N; i++){
            A[0][i] = sc.nextInt();
            A[1][i] = sc.nextInt();
            sum[i] = A[0][i]+A[1][i];
            sum1 += A[0][i];
        }
        sc.close();
        Arrays.sort(sum);
        for(int i = N-2; i >= 0; i-=2){
            sum1 -= sum[i];
        }
        System.out.println(sum1);
    }
}