//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,j,k,N;

        int[] ans=new int[(int)1e5];
        for(i=1;i<=100;i++)
        {
            for(j=1;j<=100;j++)
            {
                for(k=1;k<=100;k++)
                {
                    int sum=i*(i+j+k)+j*(j+k)+k*k;
                    ans[sum]++;
                }
            }
        }
        N=Integer.parseInt(br.readLine().trim());
        StringBuilder sb=new StringBuilder();
        for(i=1;i<=N;i++) sb.append(ans[i]).append("\n");
        System.out.println(sb);
    }
}