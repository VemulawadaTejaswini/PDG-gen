import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long[] p;
    int N;
    ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int Q = sc.nextInt();
        
        int[] t = new int[N];
        
        for(int i = 0;i<N-1;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            t[b] = a;
        }
        p = new long[N];
        for(int i= 0;i<Q;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt();
            p[a] += b;
        }
        
        for(int i= 1;i<N;i++){
            p[i] += p[t[i]];
        }
        for(int i =0;i<N;i++){
            System.out.println(p[i]);
        }
    }
}
