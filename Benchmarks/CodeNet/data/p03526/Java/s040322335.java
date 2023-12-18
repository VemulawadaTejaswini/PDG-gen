import java.util.*;

class Main {
    static final long A=1000000001;
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
        long[][]dp=new long[n+1][n+1];
        for(int i=0;i<n+1;++i)Arrays.fill(dp[i],A);
        dp[0][0]=0;
        for(int i=0;i<n;++i){
            long p=hp[i]/A;
            long h=hp[i]%A;
            p-=h;
            for(int j=0;j<=n;++j)
                dp[i+1][j]=dp[i][j];
            for(int j=0;j<=i;++j){
                if(dp[i][j]<=h)
                    dp[i+1][j+1]=Math.min(dp[i+1][j+1],dp[i][j]+p);
            }
        }
        int m=0;
        for(int i=0;i<=n;++i)
            if(dp[n][i]<A)m=i;
        System.out.println(m);
    }
}
