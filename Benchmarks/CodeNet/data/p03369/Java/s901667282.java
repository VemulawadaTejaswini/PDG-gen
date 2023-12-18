import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
  		String s = sc.next();
      	s = s.replace("x", "");
      	System.out.println(700 + s.length() * 100);
    }
}