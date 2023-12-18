import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      char[] c = new char[s.length()] ;

      int[] data = new int[s.length()];
      int max = 0;

      int x =  Integer.parseInt(s);
      int[] a = new int[s.length()];

      for (int i = 0;i<s.length() ;i++ ) {
        c[i] = s.charAt(i);
      }

      for (int i = 0;i<s.length() ;i++ ) {
        String str = String.valueOf(c[i]);
        a[i] = Integer.parseInt(str);
        max = Math.max(max,a[i]);
      }

      if (a[1]==max||a[2]==max) {
        System.out.print(a[0]+1);
        System.out.print(a[0]+1);
        System.out.print(a[0]+1);
        System.out.println();
      }else{
        for (int i = 0;i<s.length() ;i++ ) {
          System.out.print(max);
        }
              System.out.println();
      }

}
}
