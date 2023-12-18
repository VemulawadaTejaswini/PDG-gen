import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    if(str.equals("AAA") || str.equals("BBB") || str.length() != 3){
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
