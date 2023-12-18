import java.util.*;
import java.io.*;
 
public class Main {
    public static long ans(long[] A){
        int N = A.length;
        long ans = 0;
        
        if(A[N-1]>=N)return -1;
        ans += A[N-1];
        long next = A[N-1]-1;
        for(int n=N-2;n>=0;n--){
        	if(A[n]>n || A[n]<next) return -1;
        	if(A[n]>next) ans += A[n];
        	next = A[n]-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int n=0;n<N;n++) A[n]=sc.nextLong();
        System.out.println(ans(A));
    }
}