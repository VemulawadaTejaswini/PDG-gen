// ITP1_8_C Counting Characters
import java.io.*;

class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str;
         int[] alphabet = new int[26];
         while ((str = br.readLine()) != null) {
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
               if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
                  alphabet[ch[i] - 'a']++;
            }
         }
         for (int i = 0; i < alphabet.length; i++) {
            System.out.println((char)('a' + i) + " : " + alphabet[i]);
         }
         br.close();
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}