import java.util.*;
import java.lang.*;
import java.io.*;
class RangeAdd{
    int N;
    int[] d;
    public RangeAdd(int N){
        this.N = N;
        this.d = new int[N+1];
    }
    void add(int v, int l, int r){
        d[l] += v;
        d[r] -= v;
    }
    int[] out(){
        int[] ret = new int[N];
        ret[0] = d[0];
        for(int n=1; n<N; n++) {
            ret[n] = ret[n-1] + d[n];
        }
        return ret;
    }
}
public class Main {
    static int[] solve(int N, int K, int[] A){
        int[] ans = new int[N];
        for(int n=0; n<N; n++) ans[n] = A[n];

        int[] max = new int[N];
        Arrays.fill(max, N);
        for(int k=0; k<K; k++){
            RangeAdd next = new RangeAdd(N);
            for(int n=0; n<N; n++){
                next.add(1, Math.max(0,n-ans[n]), Math.min(n+ans[n]+1, N));
            }
            ans = next.out();
            if(Arrays.equals(ans,max)){
                break;
            } 
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();
        int[] ans = solve(N,K,A);
        for(int n=0; n<N-1; n++) System.out.print(ans[n] + " "); System.out.println(ans[N-1]);
        
    }
}
