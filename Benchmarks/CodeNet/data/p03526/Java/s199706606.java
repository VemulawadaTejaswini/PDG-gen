import java.util.*;

class Main {
    static final long A=1000000001;
    static final long I=(1L<<59)-1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        long[]hp=new long[n];
        for(int i=0;i<n;++i){
            long h=Integer.parseInt(scan.next());
            long p=Integer.parseInt(scan.next());
            hp[i]=(h+p)*A+h;
        }
        Arrays.sort(hp);
        long[][]dp=new long[2][n+1];
        for(int i=0;i<2;++i)Arrays.fill(dp[i],I);
        dp[0][0]=0;
        for(int i=0;i<n;++i){
            long p=hp[i]/A;
            long h=hp[i]%A;
            p-=h;
            int a=i%2;
            System.arraycopy(dp[a],0,dp[1-a],0,n+1);
            for(int j=0;j<=i;++j){
                if(dp[a][j]<=h)
                    dp[1-a][j+1]=Math.min(dp[1-a][j+1],dp[a][j]+p);
            }
        }
        int m=0;
        for(int i=0;i<=n;++i)
            if(dp[n%2][i]<I)m=i;
        System.out.println(m);
    }
}
