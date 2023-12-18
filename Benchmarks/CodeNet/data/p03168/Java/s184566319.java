import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double solve[][] = new double[3001][3001];
    public static double probabilities[] = new double[3000];
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        String S[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            probabilities[i]=Double.parseDouble(S[i]);
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
                solve[i][j]=0;
        }
        solve[0][0]=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                solve[i][j+1]+=solve[i][j]*(1-probabilities[j]);
                solve[i+1][j+1]=solve[i][j]*(probabilities[j]);
            }
        }
        double totalProbability=0.0d;
        for(int i=0;i<(n+1)/2;i++)
            totalProbability+=solve[i][(int)n];
        System.out.println(1-totalProbability);
        /*for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
                System.out.printf("%1.8f ",solve[i][j]);
            System.out.println();
            //System.out.println(solve[i][(int)n]);
        }*/

    }
}