import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);
        int k=Integer.parseInt(str[3]);
        int ans=0;
        if(a>=k)
        {
            ans=k;
            k=0;
        }
        if(a<k)
        {
            ans+=a;
            k-=a;
        }
        if(k>0)
        {
            if(b>k)
            k=0;
            else
            k-=b;
        }
        if(k>0)
        ans-=k;
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}