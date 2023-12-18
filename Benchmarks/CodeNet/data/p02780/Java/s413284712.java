import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double [] P = new double[N];
        double [] L = new double[N];
        double p_sum = 0;
        double max = 0;
        for(int i=0;i<N;i++){
            int p = sc.nextInt();
            double sum = 0;
            for(int j=1;j<=p;j++) sum+=j;
            sum/=p;
            P[i] = sum;
            if(K>i){
                p_sum+=P[i];
                max+=P[i];
            }
            else{
                p_sum=p_sum-P[i-K]+P[i];
                if(max<p_sum) max = p_sum;
            }
        }
        System.out.println(max);
    }
}