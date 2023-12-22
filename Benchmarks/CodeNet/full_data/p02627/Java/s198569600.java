import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char c = s.charAt(0);
    if (c >= 'a' && c <= 'z') {
    	System.out.println("a");
    } else {
    	System.out.println("A");
    }
    
  }
}