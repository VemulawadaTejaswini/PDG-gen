import java.util.*;
import java.io.*;

public class Main
{
  	int n, d, cnt = 0;
  
    Main(Scanner in, PrintWriter out)
    {
      n = in.nextInt();
      for (int i = 1; i <= n; i += 2)
      {
        d = 0;
        for (int j = 1; j*j <= i; j++)
        {
          if (i % j == 0)
            d += 2;
          if (j*j == i) d--;
        }
        
        if (d == 8) cnt++;
      }
      out.print(cnt);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}