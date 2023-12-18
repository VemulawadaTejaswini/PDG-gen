import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    String s = sc.next();
    String t = sc.next();

    sb.append(t);
    sb.append(s);
    String ans = sb.toString();

    System.out.println(ans);
  }
}
