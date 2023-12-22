import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = sc.next();
    
    if (num >= str.length()) {
      System.out.println(str);
    }
    else {
      System.out.println(str.substring(0, num));
    }
  }
}