import java.util.*;
 
class Main {
	public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in)
          String S = sc.next();
      	  String T = sc.next();
      if(S.epuals(T.substring(0, T.length() - 1)))
        System.out.println("Yes");
      else
        System.out.println("No")
    
    }
}