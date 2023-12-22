import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
            B[i] = sc.nextLong();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        long ans;
        if(N % 2 == 1){
            ans = B[N/2] - A[N/2] + 1;
        }else{
            long ai = A[N/2] + A[N/2-1];
            long bi = B[N/2] + B[N/2-1];
            ans = bi-ai+1;
        }
        System.out.println(ans);
    }
}
