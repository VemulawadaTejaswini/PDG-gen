import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solve[] = new long[100001];
    public static int a[] = new int[100001];
    public static long n;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Long.parseLong(br.readLine());
        for(int i=0;i<n-1;i++)
            solve[i]=-1;
        solve[(int)n-1]=0;
        String S[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(S[i]);
        System.out.println(DP(0));
    }
    public static long DP(int x)
    {
        if(solve[x]==-1)
        {
            if(x==n-2)
                solve[x]=DP(x+1)+(Math.abs(a[x]-a[x+1]));
            else
                solve[x]=Math.min(DP(x+1)+(Math.abs(a[x]-a[x+1])),DP(x+2)+(Math.abs(a[x]-a[x+2])));
        }
        return solve[x];
    }
}