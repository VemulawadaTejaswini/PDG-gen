import java.util.*;

public class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    long A[] = new long[N];
    long B[] = new long[N-1];
     for(int i=0; i<N; i++){
         A[i]= sc.nextInt();
     }
     int ans =0;
        B[N-2]=A[N-1];
        for(int i=N-1; i>1; i--){
            B[i-2]=(A[i-1]+B[i-1])%1000000007;
        }
        for(int i=0; i<N-1; i++){
            ans = (int)((ans+A[i]*B[i])%1000000007);
        }

        System.out.println(ans);
 }
}
