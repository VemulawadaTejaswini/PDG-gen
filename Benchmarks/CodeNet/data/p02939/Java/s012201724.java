import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k;

		String str = br.readLine();    
        
      	int count = 0;
      String ch1=""+str.charAt(0);
      String ch2="";
      for(i=1;i<str.length();i++)
      {
        ch2+=str.charAt(i);
        while(i+1<str.length() && ch2.equals(ch1))
        {
          i++;
          ch2+=str.charAt(i);
        }
        if(!ch2.equals(ch1))
        	count++;
        ch1=ch2;
        ch2="";
      }
      out.print(count+1);
	
	out.flush();
	out.close();
	}
}