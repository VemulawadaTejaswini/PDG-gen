import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int x = Integer.parseInt(str);

      System.out.println( Math.pow(x,3) );

   }
}