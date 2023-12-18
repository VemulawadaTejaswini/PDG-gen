import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      char[] c = new char[s.length()] ;

      int[] data = new int[s.length()];
      int max = 0;



      for (int i = 0;i<s.length() ;i++ ) {
        c[i] = s.charAt(i);

      }
      for (int i = 0;i<s.length() ;i++ ) {
        String str = String.valueOf(c[i]);
        int a = Integer.parseInt(str);
        max = Math.max(max,a);
      }

      for (int i = 0;i<s.length() ;i++ ) {
        System.out.print(max);
      }
      System.out.println();

}
}
