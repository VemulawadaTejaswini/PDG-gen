import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        long n=Long.parseLong(str[0]);
        long k=Long.parseLong(str[1]);
        if(n%k==0)
        pw.println(0);
        else
        {
            n=n%k;
            pw.println(Math.min((long)Math.abs(n-k),(long)Math.abs(n)));
        }
        pw.flush();
        pw.close();
    }
}