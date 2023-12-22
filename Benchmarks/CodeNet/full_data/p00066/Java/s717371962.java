
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			char ans = 'd';
			for(int i=0;i<3;i++) {
				if(s.charAt(3*i) != 'd' && s.charAt(3*i) == s.charAt(3*i+1) && 
				   s.charAt(3*i) == s.charAt(3*i+2)) ans = s.charAt(3*i);
				if(s.charAt(i) != 'd' && s.charAt(i) == s.charAt(3+i) &&
				   s.charAt(i) == s.charAt(6+i)) ans = s.charAt(i);
			}
			if(s.charAt(0) != 'd' && s.charAt(0) == s.charAt(4) && 
			   s.charAt(0) == s.charAt(8)) ans = s.charAt(0);
			if(s.charAt(2) != 'd' && s.charAt(2) == s.charAt(4) &&
			   s.charAt(6) == s.charAt(2)) ans = s.charAt(2);
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}