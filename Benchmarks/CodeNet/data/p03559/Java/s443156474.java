import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for(int n=0;n<N;n++) A[n]=sc.nextInt();
        for(int n=0;n<N;n++) B[n]=sc.nextInt();
        for(int n=0;n<N;n++) C[n]=sc.nextInt();
        
        long[] Bcount = new long[N];
        for(int b=0;b<N;b++){
        	for(int c=0;c<N;c++){
        	    if(C[c]>B[b]) Bcount[b]++;
        	}
        }
        long ans = 0;
        for(int a=0;a<N;a++){
        	for(int b=0;b<N;b++){
        	    if(B[b]>A[a]) ans += Bcount[b];
        	}
        }
        System.out.println(ans);
    }
}