import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        for(int i = 0; i < N+1; i++)
            A[i] = sc.nextInt();
        for(int i = 0; i < N; i++)
            B[i] = sc.nextInt();
        long count = 0;

        for(int i = 0; i < N; i++) {
            if (B[i] >= (A[i] + A[i+1])) {
                count += (A[i]+A[i+1]);
                A[i+1] = 0;
            }
            if((B[i] > A[i]) && (B[i] < (A[i] + A[i+1]))) {
                count += B[i];
                A[i+1] -= (B[i] - A[i]);
            }
            if(B[i] <= A[i]){
                count += B[i];
            }
        }
        sc.close();
        System.out.println(count);        
    }
}