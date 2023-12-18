import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int maxn=2;
    static long[] f5ac, inv;
    static ArrayList<Integer>[] rec;
    static int[] v;
    static int n,k;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt(); k =sc.nextInt();
        v = new int[n+1];
        for(int i=1;i<=n;i++) v[i]=sc.nextInt();
        int ans = 0;
        for(int head = 0; head<=n;head++){
            for(int tail = 0;tail<=n;tail++){
                if(head+tail>Math.min(k,n)) break;
                int sum = 0;
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for(int i=1;i<=head;i++){
                    sum += v[i]; pq.add(v[i]);
                }
                for(int i=n;i>n-tail;i--){
                    sum += v[i]; pq.add(v[i]);
                }
                int cur = sum;
                for(int j=1;j<=k-(head+tail)&&pq.size()>0;j++){
                    sum -= pq.poll();
                    cur = Math.max(cur,sum);
                }
                ans = Math.max(ans,cur);
            }
        }
        System.out.println(ans);
    }
}

