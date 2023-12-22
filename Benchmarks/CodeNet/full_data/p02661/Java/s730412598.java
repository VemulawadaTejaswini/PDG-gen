import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    static long medianx2(long[] A){
        long[] B = Arrays.copyOf(A,A.length);
        Arrays.sort(B);
        if(B.length %2 == 0) return B[B.length/2 - 1] + B[B.length/2];
        else return 2 * B[B.length / 2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        for(int n=0; n<N; n++){
            A[n] = sc.nextLong();
            B[n] = sc.nextLong();
        }
        long min = medianx2(A);
        long max = medianx2(B);
        System.out.println(N%2==0 ? 1+max-min : 1+(max-min)/2);
    }
}

