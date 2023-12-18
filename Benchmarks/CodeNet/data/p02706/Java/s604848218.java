import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw=new PrintWriter(System.out);
    String str[]=br.readLine().split(" ");
    int n=Integer.parseInt(str[0]);
    int m=Integer.parseInt(str[1]);
    int hw=0;
    str=br.readLine().split(" ");
    for(int i=0;i<m;i++)
    hw+=Integer.parseInt(str[i]);
    if(hw>n)
    pw.println(-1);
    else
    pw.println(n-hw);
    pw.flush();
    pw.close();
  }
}