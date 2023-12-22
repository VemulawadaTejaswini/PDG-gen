import java.util.*;
import java.math.*;
public class Main {
	static int[] color;
	static int[] component;
	static int component_count;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		if(s.equals(t.substring(0, t.length() - 1))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
} 
