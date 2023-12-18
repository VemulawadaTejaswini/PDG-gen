import java.util.*;

public class Main {
  public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.next();
    	int b = sc.next();
    	int c = sc.next();
    	if(b - a == c - b) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
  }
}