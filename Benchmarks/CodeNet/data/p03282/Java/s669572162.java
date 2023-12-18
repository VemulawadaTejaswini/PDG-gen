import java.util.*;
import java.io.*;

public class Main
{
  	int l, at = 0;
  	char[] s;
  	long k;
  
    Main(Scanner in, PrintWriter out)
    {
      s = in.next().toCharArray();
      l = s.length;
      k = in.nextLong();
      while (at < l && at < k && s[at] == '1') at++;
      if (at == l) at--;
      out.print(s[at]);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}
