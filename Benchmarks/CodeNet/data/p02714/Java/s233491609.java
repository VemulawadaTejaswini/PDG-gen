import java.util.*;
import java.io.*;
public class Main
{
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //String str[]=br.readLine().split(" ");
        //int n=Integer.parseInt(br.readLine());
        //int n=Integer.parseInt(str[0]);
        //int n=Integer.parseInt(str[1]);
        //String s=br.readLine();
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        int rcntr=0,gcntr=0,bcntr=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            rcntr++;
            else if(s.charAt(i)=='B')
            bcntr++;
            else
            gcntr++;
        }
        long possible=1L*rcntr*gcntr*bcntr;
        for(int i=1;i<=n;i++)
        {
            for(int j=0,k=i,p=2*i;j<n&&k<n&&p<n;j++,p++,k++)
            {
                if(s.charAt(j)!=s.charAt(p)&&s.charAt(j)!=s.charAt(k)&&s.charAt(k)!=s.charAt(p))
                possible--;
            }
        }
        pw.println(possible);
        pw.flush();
        pw.close();
    }
}