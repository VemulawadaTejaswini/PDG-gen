//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        String s[]=br.readLine().trim().split(" ");
        Integer a[]=new Integer[N];
        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a,Collections.reverseOrder());

        long ans=a[0]; int cur=0;
        for(i=2;i<N;i++)
        {
            if(i%2==0) cur++;
            ans+=a[cur];
        }

        System.out.println(ans);
    }
}