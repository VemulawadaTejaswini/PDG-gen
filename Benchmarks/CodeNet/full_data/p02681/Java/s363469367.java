import java.util.*;
public class Main{
	public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);
      
      String a = sc.next();
      String n = sc.next();
      
      if (n.startsWith(a) && n.length() == a.length() + 1) {
      	System.out.println("Yes");
      } else {
      	System.out.println("No");      
      }
    }
}