// ITP1_9_D Transformation
import java.io.*;

class Main {

   static String str;

   public static void main(String args[]) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         str = br.readLine();
         int q = Integer.parseInt(br.readLine());
         for (int i = 0; i < q; i++) {
            String[] inst = br.readLine().split(" ");
            int a = Integer.parseInt(inst[1]);
            int b = Integer.parseInt(inst[2]) + 1;
            if (inst[0].equals("print"))  print(a, b);
            else if (inst[0].equals("reverse")) reverse(a, b);
            else if (inst[0].equals("replace")) replace(a, b, inst[3]);
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }

   static void print(int a, int b) {
      System.out.println(str.substring(a, b));
   }

   static void reverse(int a, int b) {
      String rev = new StringBuffer(str.substring(a, b)).reverse().toString();
      if (a == 0)
         str = rev + str.substring(b, str.length());
      else if (b == str.length())
         str = str.substring(0, a) + rev;
      else
         str = str.substring(0, a) + rev + str.substring(b, str.length());
   }

   static void replace(int a, int b, String p) {
      str = new StringBuffer(str).replace(a, b, p).toString();
   }
}