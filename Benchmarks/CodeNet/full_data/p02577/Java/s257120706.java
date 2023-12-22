import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        char carr[]=br.readLine().toCharArray();
        int sum=0;
        for(int i=0;i<carr.length;i++)
        {
            sum=sum+(carr[i]-'0');
        }
        pw.println((sum%9==0)?"Yes":"No");
        pw.flush();
        pw.close();
    }
}