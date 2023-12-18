import java.util.*;

class Main{
    static int N;
    static long[] sum;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sum = new long[N+1];
        long[] A = new long[N+1];
        for(int i=1;i<=N;i++) A[i]=sc.nextLong();
        for(int i=1;i<=N;i++) sum[i] = sum[i-1]+A[i];
        long ans = Long.MAX_VALUE;
        for(int i=2;i<=N-2;i++){
            long difLeft = halfClo(1,i);
            long P = (sum[i]+difLeft)/2;
            long Q = (sum[i]-difLeft)/2;
            long difRight = halfClo(i+1,N);
            long R = (sum[N]-sum[i]+difRight)/2;
            long S = (sum[N]-sum[i]-difRight)/2;
            long[] cur = new long[]{P,Q,R,S};
            Arrays.sort(cur);
            ans = Math.min(ans,cur[3]-cur[0]);
        }
        System.out.println(ans);
    }
    static long halfClo(int left, int right){
        long hi = sum[right]-sum[left-1];
        long lo = 0;
        while(hi-lo>1){
            long mid = (hi+lo)/2;
            if(check(left,right,mid)) hi = mid;
            else lo = mid;
        }
        return hi;
    }
    static boolean check(int left, int right, long target){
        long all = sum[right]-sum[left-1];
        int hi = right-1;
        int lo = left;
        while(hi-lo>1){
            int mid = (hi+lo)/2;
            long cur = sum[mid]-sum[left-1];
            if(2*cur>=all-target&&2*cur<=all+target) return true;
            if(2*cur<all-target) lo = mid;
            else hi = mid;
        }
        boolean b1 = 2*(sum[hi]-sum[left-1])>=all-target&&2*(sum[hi]-sum[left-1])<=all+target;
        boolean b2 = 2*(sum[lo]-sum[left-1])>=all-target&&2*(sum[lo]-sum[left-1])<=all+target;
        return b1||b2;
    }
}
