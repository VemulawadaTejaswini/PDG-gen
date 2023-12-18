import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solve[][] = new long[100001][4];
    public static int a[] = new int[100001];
    public static int b[] = new int[100001];
    public static int c[] = new int[100001];
    public static long n;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Long.parseLong(br.readLine());
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<4;j++)
                solve[i][j]=-1;
        }
        for(int j=1;j<4;j++)
            solve[(int)n][j]=0;
        for(int i=0;i<n;i++)
        {
            String S[]=br.readLine().split(" ");
            a[i]=Integer.parseInt(S[0]);
            b[i]=Integer.parseInt(S[1]);
            c[i]=Integer.parseInt(S[2]);
        }
        //System.out.println(DP(0,-1));
        System.out.println(Math.max(Math.max((DP(1,1)+a[0]),(DP(1,2)+b[0])),(DP(1,3)+c[0])));
        //System.out.println("\n\n\n");
        /*for(int i=0;i<n;i++)
            System.out.println(solve[i]);*/
    }
    public static long DP(int x,int lastChosen)
    {
        if(solve[x][lastChosen]==-1)
        {
            if(lastChosen==1)
                solve[x][lastChosen]=Math.max((DP(x+1,2)+b[x]),(DP(x+1,3)+c[x]));
            else if(lastChosen==2)
                solve[x][lastChosen]=Math.max((DP(x+1,1)+a[x]),(DP(x+1,3)+c[x]));
            else /*if(lastChosen==3)*/
                solve[x][lastChosen]=Math.max((DP(x+1,1)+a[x]),(DP(x+1,2)+b[x]));
        }
        return solve[x][lastChosen];
    }
}