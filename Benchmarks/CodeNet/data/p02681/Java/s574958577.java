import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    int u= s.length();
    if(s.equals(t.substring(0,u))) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}