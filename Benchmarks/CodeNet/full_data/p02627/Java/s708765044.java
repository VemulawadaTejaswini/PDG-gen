import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);

      char c = sc.next().charAt(0);
      if(Character.isLowerCase(c))
      System.out.println("a");
    else
      System.out.println("A");
  }
}