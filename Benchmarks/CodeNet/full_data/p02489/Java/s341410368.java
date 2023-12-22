import java.io.*;

public class Main
{
   public static void main(String[] args)
   {
      int count=0;
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s=br.readLine();
         while(!s.equals("0")){
            count++;
            System.out.println("Case " + count + ": " + s);
         }
      }
      catch(Exception e){}
   }
}