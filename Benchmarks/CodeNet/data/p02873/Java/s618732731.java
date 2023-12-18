import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main {
	//static int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
	public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = System.out;
        	PrintWriter out = new PrintWriter(outputStream);
     
            int i, j, u=0, v=0;
      String str=br.readLine();
      long sum=0, k=0, prev=0, c=0;
      for(i=0;i<str.length();i++)
      {
        char ch = str.charAt(i);
        if(ch=='<')
        {
          if(k!=0)
          {
            if(k>c)
            {
              sum+=(k*(k+1)/2);
              c--;
              sum+=(c*(c+1)/2);
            }
            else
            {
              k--;
				sum+=(k*(k+1)/2);
              sum+=(c*(c+1)/2);
            }
            c=0;
          }
          c++;
          k=0;
        }
        else
        {
          k++;
        }
      }
      if(c!=0)
      {
        if(k>c)
            {
              sum+=(k*(k+1)/2);
              c--;
              sum+=(c*(c+1)/2);
            }
            else
            {
              if(k!=0)
              	k--;
				sum+=(k*(k+1)/2);
              sum+=(c*(c+1)/2);
            }
      }
      out.print(sum);
    	out.flush();
    	out.close();
    	}
    }