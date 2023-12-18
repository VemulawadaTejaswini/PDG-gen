import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solveWeights[][] = new long[101][100001];
    public static int weights[] = new int[100];
    public static int value[] = new int[100];
    public static long n,w;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nw[]=br.readLine().split(" ");
        n=Long.parseLong(nw[0]);
        w=Long.parseLong(nw[1]);
        int sumValues=0;
        for(int i=0;i<n;i++)
        {

            String S[]=br.readLine().split(" ");
            weights[i]=Integer.parseInt(S[0]);
            value[i]=Integer.parseInt(S[1]);
            sumValues+=value[i];
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sumValues;j++)
                solveWeights[i][j]=-1;
        }
        solveWeights[0][0]=0;
        for(int j=1;j<=sumValues;j++)
            solveWeights[0][j]=-2;
        /*for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sumValues;j++)
            {
                if(solveWeights[i][j]!=-1)
                {
                    solveWeights[i+1][j]=solveWeights[i][j];
                    solveWeights[i+1][j+value[i]]=solveWeights[i][j]+weights[i];
                }
            }
        }*/
        /*System.out.println(solveWeights[0][0]);
        System.out.println(solveWeights[1][0]);
        System.out.println(solveWeights[1][10]);*/
        for(int i=0;i<=sumValues;i++)
            DP((int)n,i);
        int maxValue=0;
        for(int i=0;i<=sumValues;i++)
        {
            if(solveWeights[(int)n][i]!=-2&&solveWeights[(int)n][i]!=-1&&solveWeights[(int)n][i]<=w)
                maxValue=i;
            //System.out.println(solveWeights[(int)n][i]);
        }
        /*for(int j=0;j<=sumValues;j++)
        {
            System.out.print(j+"\t");
            for(int i=0;i<=n;i++)
                System.out.printf("%02d ",solveWeights[i][j]);
            System.out.println();
        }*/
        System.out.println(maxValue);
    }
    public static long DP(int x,int currentValue)
    {
        if(x!=0)
        {
            if(currentValue-value[x-1]<0/*||DP(x-1,currentValue-weights[x-1])==-1*/)
                solveWeights[x][currentValue]=DP(x-1,currentValue);
            else if(DP(x-1,currentValue)==-2)
            {
                if(DP(x-1,currentValue-value[x-1])==-2)
                    solveWeights[x][currentValue]=-2;
                else
                    solveWeights[x][currentValue]=DP(x-1,currentValue-value[x-1])+weights[x-1];
            }
            else if(DP(x-1,currentValue-value[x-1])==-2)
                solveWeights[x][currentValue]=DP(x-1,currentValue);
            else
                solveWeights[x][currentValue]=Math.min(DP(x-1,currentValue),DP(x-1,currentValue-value[x-1])+weights[x-1]);
        }
        return solveWeights[x][currentValue];
    }
}