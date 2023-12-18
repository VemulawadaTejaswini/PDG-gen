import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String n = sc.next();
    String a = n.substring(0, 1);
    String b = n.substring(1, 2);
    String c = n.substring(2, 3);
    String d = n.substring(3, 4);
    
    if (a.equals(b) && b.equals(c)) {
      System.out.println("Yes");
    } else if (b.equals(c) && c.equals(d)) {
      System.out.println("No");
    }
  }
}