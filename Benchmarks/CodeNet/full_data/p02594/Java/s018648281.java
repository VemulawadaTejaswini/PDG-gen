import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        pw.println(Integer.parseInt(br.readLine())>=30?"Yes":"No");
        pw.flush();
        pw.close();
    }
}