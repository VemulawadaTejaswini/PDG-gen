//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s[]=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        int M=Integer.parseInt(s[1]);

        s=br.readLine().trim().split(" ");
        int a[]=new int[N];
        for(i=0;i<N;i++)
            a[i]=Integer.parseInt(s[i]);

        int sum=0;
        for(i=0;i<N;i++) sum+=a[i];

        double req=(double)sum/(4*M);

        int count=0;
        for(i=0;i<N;i++)
        {
            if(a[i]>=req) count++;
        }

        System.out.println(count>=M?"Yes":"No");
    }
}