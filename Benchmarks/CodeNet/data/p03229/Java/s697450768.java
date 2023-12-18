import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        long sum = 0;
        for(long w:a) sum += w;
        long ans = n%2==0?solveEven(a,sum,n):solveOdd(a,sum,n);
        System.out.println(ans);
    }
    // when n is odd
    static long solveOdd(long[] a, long sum, int n){
        long sum1 = 0;
        for(int i=n/2+1;i<=n-1;i++) sum1 += a[i];
        long ans1 = 2*sum1-2*(sum-sum1)+a[n/2]+a[n/2-1];
        long sum2 = 0;
        for(int i=n/2;i<n;i++) sum2 += a[i];
        long ans2 = 2*sum2-a[n/2]-a[n/2+1]-2*(sum-sum2);
        return Math.max(ans1,ans2);
    }
    static long solveEven(long[] a, long sum, int n){
        if(n==2) return a[1]-a[0];
        long sum1 = 0;
        for(int i=n/2;i<n;i++) sum1 += a[i];
        long ans1 = 2*sum1-a[n/2]-2*(sum-sum1)+a[n/2-1];
        return ans1;
    }
}
