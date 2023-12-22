import java.util.*;

public class Main {
 
	public static void main(String[] args) {
      Scanner sr = new Scanner(System.in);
      String str = sr.next();
      if(Character.isUpperCase(str.charAt(0)))
        System.out.println( "A" );
      else 
        System.out.println( "a" );
	}
}