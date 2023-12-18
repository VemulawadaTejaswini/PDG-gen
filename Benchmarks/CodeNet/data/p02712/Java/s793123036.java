import java.util.*;
import java.io.*;
public class Main
{
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
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3!=0&&i%5!=0)
            sum=sum+i;
        }
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}