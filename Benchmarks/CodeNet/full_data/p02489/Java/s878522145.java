import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {
      int i = 0;
      int[] x = new int[32767];

      while(true){

         BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));
      
         String str = br.readLine();
         x[i] = Integer.parseInt(str);
         if(x[i] == 0) break;
         i++;
      }

      for(i=0; x[i] != 0; i++){
         System.out.println( "Case " + (i+1) + ": " + x[i] );
      }
   }
}