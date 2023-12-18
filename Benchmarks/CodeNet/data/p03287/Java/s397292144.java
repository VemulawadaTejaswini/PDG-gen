import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        long[] sum = new long[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(i==0){
                sum[i] = A[i];
            }
            else{
                sum[i] = sum[i - 1] + A[i];
            }
        }
        long ans = 0;
        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                long x;
                if(i==0){
                    x = sum[j];
                }
                else{
                    x = sum[j] - sum[i - 1];
                }
                if(x%M==0){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}