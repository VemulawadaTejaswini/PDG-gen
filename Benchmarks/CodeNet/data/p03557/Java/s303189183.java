import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        long[] C = new long[N];
        for(int i = 0;i < N;i++)    A[i] = sc.nextLong();
        for(int i = 0;i < N;i++)    B[i] = sc.nextLong();
        for(int i = 0;i < N;i++)    C[i] = sc.nextLong();
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long[] BC = new long[N];
        long[] AB = new long[N];
        int cid = N-1;
        for(int i = N-1;i >= 0;i--){
            while(cid >= 0 && B[i] < C[cid]) cid--;
            if(i == N-1)    BC[i] = (long)(N-1-cid);
            else    BC[i] = (long)(N-1-cid)+BC[i+1];
        }
        int bid = N-1;
        for(int i = N-1;i >= 0;i--){
            while(bid >= 0 && A[i] < B[bid])    bid--;
            if(i == N-1){
                if(A[i] >= B[N-1])    AB[i] = 0;
                else    AB[i] = BC[bid+1];
            }else{
                if(A[i] >= B[N-1])  AB[i] = AB[i+1];
                else    AB[i] = BC[bid+1]+AB[i+1];
            }
        }
        System.out.println(AB[0]);
    }
}