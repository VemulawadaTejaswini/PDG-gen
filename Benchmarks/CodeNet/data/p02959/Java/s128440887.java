import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N + 1];
        long B[] = new long[N];
        for(int i = 0; i < N + 1; i++){
            A[i] = sc.nextLong();
        }
        for(int i = 0; i < N; i++){
            B[i] = sc.nextLong();
        }
        
        long total = 0;
        for(int i = 0; i < N; i++){
            if(A[i] <= B[i]){
                total += A[i];
                B[i] = B[i] - A[i];
            }else{
                total += B[i];
                continue;
            }
            if(A[i + 1] <= B[i]){
                total += A[i + 1];
                A[i + 1] = 0;
            }else{
                total += B[i];
                A[i + 1] = A[i + 1] - B[i];
            }
        }
        System.out.println(total);
    }
}
