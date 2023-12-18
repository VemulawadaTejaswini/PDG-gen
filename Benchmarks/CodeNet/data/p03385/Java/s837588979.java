import java.io.*;

public class Main {
   public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
      String line = reader.readLine();
      for (int i = 0; i < 3; i++) {
         char c = line.charAt(i);
         if (c == 'a') {
            for (int j = 0; j < 3; j++) {
               if (c == 'b') {
                  for (int s = 0; s < 3; s++) {
                     if (c == 'c') {
                        System.out.println("Yes");
                     }
                     else {
                        System.out.println("No");
                     }
                  }
               }
               else {
                  System.out.println("No");
               }
            }
         }
         else {
            System.out.println("no");
         }
      }
      System.out.println("no");
      } catch (IOException e) {
         System.out.println(e);
      }
   }
}