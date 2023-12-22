// ITP1_9_A Finding a Word
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String W;
      String T;
      int cnt = 0;

      try {
         W = br.readLine();
         T = br.readLine();
         while (!(T.equals("END_OF_TEXT"))) { 
            String[] Ti = T.split(" ");
            for (int i = 0; i < Ti.length; i++) {
               if (Ti[i].equalsIgnoreCase(W))
                  cnt++;
            }
            T = br.readLine();
         }
         System.out.println(cnt);
      }

      catch (Exception e) {
         System.err.println(e);
      }

   }
}