import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String s = in.next();
      boolean yes = true;
      int n = s.length();
      for(int i = 0, j = n-1; i< j; i++, j--)yes &= s.charAt(i) == s.charAt(j);
      for(int i = 0, j = (n-1)/2-1; i< j; i++, j--)yes &= s.charAt(i) == s.charAt(j);
      for(int i = (n+3)/2-1, j = n-1; i< j; i++, j--)yes &= s.charAt(i) == s.charAt(j);
      System.out.println(yes?"Yes":"No");
    }
}