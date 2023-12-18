import java.io.*;
public class Main
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      int N,T;
      long X,Y,i,c=0;
      
      //System.out.println();
      
      String s[]=br.readLine().trim().split(" ");
      X=Long.parseLong(s[0]);
      Y=Long.parseLong(s[1]);
      
      for(i=X;i<=Y;i*=2)
      {
          c++;
      }
      System.out.println(c);
  }
}