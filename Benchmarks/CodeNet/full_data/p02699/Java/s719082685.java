import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int s=Integer.parseInt(str[0]);
        int w=Integer.parseInt(str[1]);
        if(s<=w)
        pw.println("unsafe");
        else
        pw.println("safe");
        pw.flush();
        pw.close();
    }
}