import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        long x=Long.parseLong(br.readLine());
        long sum=100;
        int cntr=0;
        while(sum<x)
        {
            sum=sum+sum/100;
            cntr++;
        }
        pw.println(cntr);
        /*for(int x=0;x<q;x++)
        {
            String str[]=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int m=Integer.parseInt(str[1]);
            String s=br.readLine();
        }*/
        pw.flush();
        pw.close();
    }
}