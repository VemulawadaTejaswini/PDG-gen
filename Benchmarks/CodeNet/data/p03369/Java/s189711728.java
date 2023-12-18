import java.util.*;

import sun.font.TrueTypeFont;

import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      char[] str = sc.next().toCharArray()
      int count = 700;
      for (char c : str){
        count +=  c == 'o' ? 100 : 0;
      }
      out.println(count);

   }
}