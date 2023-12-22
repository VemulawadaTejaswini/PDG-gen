import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(Comparator.comparing(Pair::getMin).reversed());
        Arrays.sort(A);
        queue.add(new Pair(A[N-1], A[N-2]));
        queue.add(new Pair(A[N-1], A[N-2]));
        ans += A[N-1];
        for(int i=N-3;i>=0;--i){
            Pair top = queue.poll();
            ans += top.getMin();
            queue.add(new Pair(top.p,A[i]));
            queue.add(new Pair(top.q,A[i]));
            // System.out.println(ans);
        }
        System.out.println(ans);
    }

    class Pair{
        long p,q;
        long min;
        Pair(long a,long b){
            p=a;q=b;
            min=Math.min(a,b);
        }
        public long getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
