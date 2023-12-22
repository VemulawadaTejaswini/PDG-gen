import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int n, len;
	String s;
	boolean wa() {
		if (s.charAt(n) != 'm' || n+2 >= len) return false;
		n++;
		if (s.charAt(n) == 'm') {
			if (!wa())
				return false;
		}
		if (n >= len || s.charAt(n) != 'e') return false;
		n++;
		if (n >= len) return false;
		if (s.charAt(n) == 'm') {
			if (!wa())
				return false;
		}
		if (n >= len || s.charAt(n) != 'w') return false;
		n++;
		return true;
	}
	
	void run() {
		s = sc.next();
		len = s.length();
		if (len == 0) {
			out.println("Cat");
			return;
		}
		n = 0;
		if (wa() && n == len)
			out.println("Cat");
		else
			out.println("Rabbit");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}