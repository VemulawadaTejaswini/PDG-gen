import java.util.*;

class Main{
    static int[] sum;
    static int[] temp;
    static int[] A;
    static long tot1; // record the number of (i,j) s.t. sum[i]>sum[j]
    static long tot2;
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sum = new int[N+1];
        temp = new int[N+1];
        tot2 = ((long)N)*((long)N+1)/2;
        A = new int[N+1];
        for(int i=1;i<=N;i++) A[i]=sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=N;i++){
            max = Math.max(max,A[i]);
            min = Math.min(min,A[i]);
        }
        int hi = max,lo=min;
        while(hi>lo+1){
            int mid = (hi+lo)/2;
            if(check(mid)) lo = mid;
            else hi=mid-1;
        }
        int ans = check(hi)?hi:lo;
        System.out.println(ans);


    }
    static boolean check(int mid){
        tot1=0;
        for(int i=1;i<=N;i++) sum[i]=(A[i]>=mid?1:-1);
        for(int i=1;i<=N;i++) sum[i] += sum[i-1];
        Merge(0,N);
        return (tot2-tot1)>=tot2/2;
    }


    static void Merge(int left, int right){
        if(left==right) return;
        int mid = (left+right)/2;
        Merge(left,mid);
        Merge(mid+1,right);
        int p = left,q=mid+1,r=left;
        while(p<=mid&&q<=right){
            if(sum[p]<=sum[q]) temp[r++]=sum[p++];
            else{
                tot1 += mid-p+1;
                temp[r++]=sum[q++];
            }
        }
        while(p<=mid) temp[r++]=sum[p++];
        while(q<=right) temp[r++]=sum[q++];
        for(int i=left;i<=right;i++) sum[i]=temp[i];
    }
}
