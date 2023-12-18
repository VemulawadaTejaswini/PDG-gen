import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long C = sc.nextLong();
        long[] X = new long[N+2];
        long[] V = new long[N+1];
        for(int i = 1;i < N+1;i++){
            X[i] = sc.nextLong();
            V[i] = sc.nextLong();
        }
        X[N+1] = C;
        long[] R = new long[N+1];
        long[] L = new long[N+2];
        long[] RM = new long[N+1];
        long[] LM = new long[N+2];
        for(int i = 1;i < N+1;i++){
            R[i] = R[i-1]+V[i]-X[i]+X[i-1];
            RM[i] = Math.max(RM[i-1], R[i]);
        }
        for(int i = N;i > 0;i--){
            L[i] = L[i+1]+V[i]-X[i+1]+X[i];
            LM[i] = Math.max(LM[i+1], L[i]);
        }
        long rlm = 0;
        for(int i = 1;i < N+1;i++){
            if(X[i]*2 >= C)  break;
            rlm = Math.max(rlm, R[i]-X[i]+LM[i+1]);
        }
        long lrm = 0;
        for(int i = N;i > 0;i--){
            if(X[i]*2 <= C)     break;
            lrm = Math.max(lrm, L[i]-X[N+1]+X[i]+RM[i-1]);
        }
        long ans = 0;
        ans = Math.max(RM[N], LM[1]);
        ans = Math.max(ans, rlm);
        ans = Math.max(ans, lrm);
        if(ans < 0) System.out.println(0);
        else    System.out.println(ans);
    }
}