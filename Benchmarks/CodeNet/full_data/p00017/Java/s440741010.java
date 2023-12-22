
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\r\\n");
		String line = sc.nextLine();
		int i;
		boolean flg = false;
		String ans = "";
		for(i=0;i<26;i++) {
			ans = "";
			for(int j=0;j<line.length();j++) {
				if( 'a' <= line.charAt(j) && 'z' >= line.charAt(j) ) 
					ans += (char)( (line.charAt(j)-'a' + i ) % 26 + 'a' );
				else ans += line.charAt(j);
			}
			for(int j=0;j<line.length();j++) {
				String tmp = ans.substring(j);
				if( tmp.startsWith("this") || tmp.startsWith("that") || tmp.startsWith("the") ) flg = true;
			}
			if( flg ) break;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}