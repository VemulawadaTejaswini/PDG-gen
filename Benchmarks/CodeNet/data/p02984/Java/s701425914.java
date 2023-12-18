import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        long sum = 0;
        long sum_odd = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            sum += A[i];
            if(i % 2 == 1)
                sum_odd += A[i];
        }
        sc.close();

        long[] c = new long[N];
        c[0] = sum - 2*sum_odd;

        for(int i = 1; i < N; i++){
            c[i] = 2*A[i-1] - c[i-1];
        }

        for(int i = 0; i < N; i++){
            System.out.print(c[i] + " ");
        }
    }
}