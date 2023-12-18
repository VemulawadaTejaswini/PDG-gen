import java.util.*;
 
public class Main {
  	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      
      if (str.substring(2,2).equals(str.substring(3,3)) && 
         str.substring(4,4).equals(str.substring(5,5))) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}
