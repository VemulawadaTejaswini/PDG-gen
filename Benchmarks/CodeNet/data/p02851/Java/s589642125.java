import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long[] a = new long[n+1];
        long[] sum = new long[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
            sum[i] = (sum[i-1]+a[i]);
        }
        //
        // sum[j]%k-j+k = sum[i]-i
        HashMap<Long,Queue<Integer>> rec = new HashMap<>(n/2);
        rec.put(0L, new LinkedList<>());
        rec.get(0L).add(0);
        long ans = 0;
        for(int j=1;j<=n;j++){
            // first, find sum[j]%k-j = sum[i]%k-i
            long key = sum[j]%k-j;
            Queue<Integer> curQueue = rec.get(key);
            if(curQueue!=null){
                ans += curQueue.size();
            }
            Queue<Integer> q2 = rec.get(key+k);
            if(q2!=null){
                while(q2.size()>0 && q2.peek()<=j-k) q2.poll();
                ans += q2.size();
            }
            if(curQueue!=null) curQueue.add(j);
            else{
                Queue<Integer> next = new LinkedList<>();
                next.add(j);
                rec.put(key, next);
            }
        }
        return ans;
    }
}

