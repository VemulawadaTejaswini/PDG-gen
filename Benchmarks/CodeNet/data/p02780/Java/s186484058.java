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

        for(int i=0; i<N; i++){
            s[i] = (1 + p[i]) / 2;
        }
 
        double max = 0;
        double[] sum = new double[N - K + 1];
        for(int i=0; i<=N-K; i++){
            for(int j=i; j<i+K; j++){
                sum[i] += s[j];
            }
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);
    }
}