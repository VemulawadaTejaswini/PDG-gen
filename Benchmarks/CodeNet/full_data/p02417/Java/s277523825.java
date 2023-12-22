// ITP1_8_C Counting Characters
import java.io.*;

class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str = br.readLine();
         int[] alphabet = new int[26];
         while (str.length() != 0) {
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               if (ch >= 'a' && ch <= 'z')
                  alphabet[ch - 'a']++;
            }
            for (int i = 0; i < alphabet.length; i++) {
               System.out.println((char)('a' + i) + " : " + alphabet[i]);
            }
            str = br.readLine();
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}