import java.util.*;
import java.io.*;

public class Main
{
  	int l, at = 0;
  	char[] s;
  	long[] sz;
  	long k, kk, add, sum;
  
    Main(Scanner in, PrintWriter out)
    {
      s = in.next().toCharArray();
      l = s.length;
      k = in.nextLong();
      for (int i = 0; i < l; i++)
        sz[i] = s[i]-'0';
      while (sum < k)
      {
        kk = k;
        if (s[at++] == '1')
        {
          sum++;
          continue;
        }
        
        add = s[at]-'0';
    	while (kk > 0 && sum+add < k)
        {
          add *= add;
          if (kk %2 == 1) add *= (s[at]-'0'); 
          kk /= 2;
        }
        
        sum += add;
        at++;
      }
      at--;
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