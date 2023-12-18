import java.util.*;

public class Main {
  public static void main(String args[]) {
  	Scanner sc = new Scanner(System.in);
    String a = sc.nextString();
    String b = sc.nextString();
    String c = sc.nextString();
    
    if (a.charAt(a.length() - 1) == b.charAt(0)) {
    	if (b.charAt(b.length() - 1) == c.charAt(0)) {
        	System.out.println("YES");
        }
    }
    System.out.println("NO");
  }
}