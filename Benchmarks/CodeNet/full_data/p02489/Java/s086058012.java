import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {

      int x = 1;

      for(int i=1; x != 0; i++){

         BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));

         String str = br.readLine();

         x = Integer.parseInt(str);

         if(x == 0) break;

         System.out.println( "Case " + i + ": " + x );
      }
   }
}