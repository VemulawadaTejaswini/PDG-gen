import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i)a[i]=scan.nextInt();
        long[] fsum = new long[n];
        long[] bsum = new long[n];
        fsum[0]=a[0];bsum[n-1]=a[n-1];
        for(int i=1;i<n;++i)fsum[i]=fsum[i-1]+a[i];
        for(int i=n-2;i>=0;--i)bsum[i]=bsum[i+1]+a[i];
        long ans = Long.MAX_VALUE;
        for(int i=2;i<n-2;++i){
            // [0, i-1] [i, n-1]
            int left = 0;
            int right =i-1;
            while(right-left>1){
                int center = (left+right)/2;
                if(fsum[center]*2 > fsum[i-1])right=center;
                else left=center;
            }

            int l2 = i;
            int r2 = n-1;
            while(r2-l2>1){
                int c = (l2+r2)/2;
                if(bsum[c]*2 > bsum[i])l2 = c;
                else r2=c;
            }

            long P1 = fsum[left], Q1 = fsum[i-1]-fsum[left];
            long P2 = fsum[right], Q2 = fsum[i-1]-fsum[right];
            long R1 = bsum[l2], S1 = bsum[i] - bsum[l2];
            long R2 = bsum[r2], S2 = bsum[i] - bsum[r2];
            long PQ1max = Math.max(P1, Q1);
            long PQ1min = Math.min(P1, Q1);
            long PQ2max = Math.max(P2, Q2);
            long PQ2min = Math.min(P2,Q2);
            long RS1max = Math.max(R1,S1);
            long RS1min = Math.min(R1,S1);
            long RS2max = Math.max(R2,S2);
            long RS2min = Math.min(R2,S2);
            ans = Math.min(ans, Math.max(PQ1max, RS1max) - Math.min(PQ1min, RS1min));
            ans = Math.min(ans, Math.max(PQ1max, RS2max) - Math.min(PQ1min, RS2min));
            ans = Math.min(ans, Math.max(PQ2max, RS1max) - Math.min(PQ2min, RS1min));
            ans = Math.min(ans, Math.max(PQ2max, RS2max) - Math.min(PQ2min, RS2min));
        }
        System.out.println(ans);
    }
}