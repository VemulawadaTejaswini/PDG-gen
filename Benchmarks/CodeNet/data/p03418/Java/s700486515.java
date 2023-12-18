import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K=sc.nextInt();
        System.out.println(help(N,K));
    }
    static long help(int N, int K){
        if(K==0) return ((long) N)*((long) N);
        long ans = 0;
        for(int a=K;a<=N;a++) ans += N-a;
        for(int b=K+1;b<N;b++){
            int x0 = N/b;
            ans += (x0-1)*(b-K);
            ans += Math.max(0,N-x0*b-K+1);
        }
        return ans;
    }
}
