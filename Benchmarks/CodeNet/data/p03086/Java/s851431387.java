import java.util.*;
import java.io.*;

public class Main
{
  	int cnt, max = 0, at = 0, l;
  	char[] s;
  	String set = "ATGC";
  
    Main(Scanner in, PrintWriter out)
    {
      s = in.next().toCharArray();
      l = s.length;
      while (at < l)
      {
        cnt = 0;
        while (at < l && set.contains(s[at]+""))
        {
          at++;
          cnt++;
        }
        max = Math.max(max, cnt);
        at++;
      }
      out.print(max);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}
