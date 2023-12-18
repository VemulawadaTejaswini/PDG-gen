import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        final long Mod = 1000000000+7;
        long[] x = new long[n];
        long[] y = new long[m];
        for(int i=0;i<n;i++) x[i] = sc.nextLong();
        for(int i=0;i<m;i++) y[i] = sc.nextLong();
        long[] unitSum = new long[n];
        long[] unitEnd = new long[n];
        for(int i=1;i<n;i++){
            long dx = x[i]-x[i-1];
            unitEnd[i]=((i*dx)%Mod+unitEnd[i-1])%Mod;
            unitSum[i]=(unitSum[i-1]+unitEnd[i])%Mod;
        }
        long[] yEnd = new long[m];
        for(int i=1;i<m;i++){
            long dy = y[i]-y[i-1];
            yEnd[i] = (yEnd[i-1]+(i*unitSum[n-1]*dy)%Mod)%Mod;
        }
        long ans = 0;
        for(int i=1;i<m;i++) ans = (ans+yEnd[i])%Mod;
        System.out.println(ans);
    }
}

