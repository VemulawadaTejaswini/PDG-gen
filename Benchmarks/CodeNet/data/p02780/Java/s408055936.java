import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] p = new double[N];
 
        for(int i=0; i<N; i++){
            p[i] = sc.nextDouble();
        }

        double[] s = new double[N];
        double[] sum = new double[N];
        for(int i=0; i<N; i++){
            s[i] = (1 + p[i]) / 2;
            if(i==0){
                sum[i] += s[i];
            }
            else{
                sum[i] += s[i] + sum[i - 1];
            }
        }
 
        double max = sum[K - 1];
        for(int i=K; i<N; i++){
            
            max = Math.max(max, sum[i] - sum[i - K]);
        }
        System.out.println(max);
    }
}