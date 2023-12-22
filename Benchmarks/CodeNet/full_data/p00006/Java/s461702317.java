import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	String reverse(String s) {
		String ans = "";
		int len = s.length();
		for (int i = 0; i < len; i++)
			ans += s.charAt(len-i-1);
		return ans;
	}
	
	void run() {
		String s = sc.nextLine();
		out.println(reverse(s));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}