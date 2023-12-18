import java.util.*;
import java.io.*;

public class Main {
    public static long time(long a, long b){
        return Math.min(Math.abs(a-0)+Math.abs(b-a), Math.abs(b-0)+Math.abs(a-b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] x = new long[N];
        for(int n=0;n<N;n++)x[n]=sc.nextLong();
        
        long ans = Long.MAX_VALUE;
        for(int n=0;n<N-K+1;n++){
        	ans = Math.min(ans,time(x[n],x[n+K-1]));
        }
        System.out.println(ans);
    }
}