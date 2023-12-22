import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int a=Integer.parseInt(br.readLine());
        pw.println(a+a*a+a*a*a);
        pw.flush();
        pw.close();
    }
}