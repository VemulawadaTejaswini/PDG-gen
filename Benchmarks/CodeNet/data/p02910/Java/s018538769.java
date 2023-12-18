import java.io.*;
import java.util.*;

public class Main {
  static String[] r = {"Sunny","Cloudy","Rainy"};
  	public static int ncr(String str)
    {
      if(str.equalsIgnoreCase("Sunny"))
        return 0;
      if(str.equalsIgnoreCase("Cloudy"))
        return 1;
      if(str.equalsIgnoreCase("Rainy"))
        return 2;
      return -1;
    }
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, k;
		
		String str= br.readLine();    
      	HashSet<Character> h = new HashSet<>();
      h.add('L');
      h.add('U');
      h.add('D');
      	HashSet<Character> s = new HashSet<>();
      s.add('R');
      s.add('U');
      s.add('D');
      int flag=0;
        for(i=1;i<=str.length();i++)
        {
          char ch =str.charAt(i-1);
          if(i%2==0)
          {
            if(!h.contains(ch))
            	{flag=1;break;}
          }
          else
          {
            if(!s.contains(ch))
            {flag=1;break;}
          }  
        }
      if(flag==1)
		out.print("No");
     else
       	out.print("Yes");
	out.flush();
	out.close();
	}
}