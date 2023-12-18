import java.util.*;

public class c{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];

        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
        }
        int ans = (int) 2e9;

        for(int i=0;i<=N-K;i++){
            ans = Math.min(ans, dist(x[i], x[i+K-1]));
        }

        System.out.println(ans);
    }

    public static int dist(int A, int B){
        int ret = 0;
        if(A >= 0 && B >= 0){
            ret = B;
        }else if(A<0 && B < 0){
            ret = A;
        }
        else         ret = Math.min(2*Math.abs(A) + B, Math.abs(A) + 2*Math.abs(B));

        return ret;
    }
}