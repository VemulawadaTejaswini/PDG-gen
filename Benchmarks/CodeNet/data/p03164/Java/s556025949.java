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
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sumValues;j++)
                solveWeights[i][j]=-1;
        }
        solveWeights[0][0]=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sumValues;j++)
            {
                if(solveWeights[i][j]!=-1)
                {
                    if(solveWeights[i+1][j]==-1||solveWeights[i][j]<solveWeights[i+1][j])
                        solveWeights[i+1][j]=solveWeights[i][j];
                    if(solveWeights[i+1][j+value[i]]==-1||solveWeights[i][j]+weights[i]<solveWeights[i+1][j+value[i]])
                        solveWeights[i+1][j+value[i]]=solveWeights[i][j]+weights[i];
                }
            }
        }
        int maxValue=0;
        for(int i=0;i<=sumValues;i++)
        {
            if(solveWeights[(int)n][i]!=-1&&solveWeights[(int)n][i]<=w)
                maxValue=i;
        }
        System.out.println(maxValue);
    }
}