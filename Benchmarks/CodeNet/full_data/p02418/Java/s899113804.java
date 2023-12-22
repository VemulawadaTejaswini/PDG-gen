// ITP1_8_D Ring
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         String s = br.readLine();
         String p = br.readLine();
         s = s + s;
         while (!(s.equals("")) && !(p.equals(""))) {
            if (s.indexOf(p) != -1)
               System.out.println("Yes");
            else
               System.out.println("No");

            s = br.readLine();
            p = br.readLine();
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}