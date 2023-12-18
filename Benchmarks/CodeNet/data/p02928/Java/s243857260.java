import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N*K];
        long count = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextLong();
        }
        for(int i = 0; i < K; i++){
            for(int j = 0; j < N; j++){
                B[j+i*N] = A[j];
            }
        }
for(int i = 0; i < N*K -1; i++){
for(int j = i+1; j < N*K; j++){
if(B[i] > B[j])count = (count+1)%1000000007;
}
}
System.out.println(count);
    }
}