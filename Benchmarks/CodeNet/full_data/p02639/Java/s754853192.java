import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        for(int i=0;i<5;i++)
        {
            if(Integer.parseInt(str[i])==0)
            {
                pw.println(i+1);
                break;
            }
        }
        pw.flush();
        pw.close();
    }
}