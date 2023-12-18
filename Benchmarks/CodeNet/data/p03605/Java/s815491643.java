import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextInt();
    
    String tens = s.substring(0, 1);
    String ones = s.substring(1, 2);
    
    if (tens.equals("9") || ones.equals("9")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}