import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        if(s.equals("ABC"))
        pw.println("ARC");
        else
        pw.println("ABC");
        pw.flush();
        pw.close();
    }
}