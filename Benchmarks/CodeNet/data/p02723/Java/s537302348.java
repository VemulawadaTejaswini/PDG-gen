import java.util.*;
 
public class Main {
  	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      
      if (str.substring(2,3).equals(str.substring(3,4)) && 
         str.substring(4,5).equals(str.substring(5,6))) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}