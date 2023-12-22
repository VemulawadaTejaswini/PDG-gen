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
		int n = Integer.parseInt(sc.nextLine());
		Set<String> set = new HashSet<String>();
		String s;
		for (int i = 0; i < n; i++) {
			set.clear();
			s = sc.nextLine();
			set.add(s);
			for (int j = 0; j < s.length()-1; j++) {
				set.add(s.substring(j+1)+s.substring(0, j+1));
				
				set.add(reverse(s.substring(0, j+1))+s.substring(j+1));
				set.add(s.substring(j+1)+reverse(s.substring(0, j+1)));
				
				set.add(s.substring(0, j+1)+reverse(s.substring(j+1)));
				set.add(reverse(s.substring(j+1))+s.substring(0, j+1));
				
				set.add(reverse(s.substring(0, j+1))+reverse(s.substring(j+1)));
				set.add(reverse(s.substring(j+1))+reverse(s.substring(0, j+1)));
			}
			out.println(set.size());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}