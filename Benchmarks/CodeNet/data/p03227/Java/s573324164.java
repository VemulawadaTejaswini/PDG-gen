import java.util.*;

public class Main {
  	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
      	String s = scanner.next();
    	System.out.println(s.length() == 2 ? s : s.charAt(2) + s.charAt(1) + s.charAt(0));
    }
}