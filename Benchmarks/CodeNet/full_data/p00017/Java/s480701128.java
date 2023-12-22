
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] words = line.split(" ");
		int i;
		boolean flg = false;
		for(i=0;i<26;i++) { for(String w: words){
			String d = "";
			for(int j=0;j<w.length();j++) d += (char) ( ( w.charAt(j) - 'a' + i ) % 26 + 'a' );
			if( d.startsWith("this") || d.startsWith("that") || d.startsWith("is") ) {
				flg = true;
				break;
			}
		}
		if( flg ) break;
		}
		for(int j=0;j<line.length();j++) {
			if( 'a' <= line.charAt(j) && 'z' >= line.charAt(j) ) 
				System.out.print((char)( (line.charAt(j)-'a' + i ) % 26 + 'a' ));
			else System.out.print(line.charAt(j));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}