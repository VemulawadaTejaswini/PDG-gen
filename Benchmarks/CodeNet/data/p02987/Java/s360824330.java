import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = str1.toCharArray();
    String s1 = new String(c);
    String ans1 = s1.substring(0, 2);
    String ans2 = s1.substring(s1.length(), -2);
    System.out.println(ans1.equals(ans2) ? "Yes" : "No");
  }
}