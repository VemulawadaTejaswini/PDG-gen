import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int W=sc.nextInt();
        int v[]=new int[N];
        int w[]=new int[N];
        for(int i=0;i<N;i++)
        {
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
        int k[][]=new int[N+1][W+1];
        //int max=0;
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=W;j++)
            {
               if(i==0 || j==0)
               {
                   k[i][j]=0;
               }
               else if(j>=w[i-1])
               {
                   k[i][j]=Math.max(v[i-1]+k[i-1][j-w[i-1]],k[i-1][j]);
               }
               else
               {
                   k[i][j]=k[i-1][j];
               }
            }
        }
        System.out.println(k[N][W]);
    }
}
