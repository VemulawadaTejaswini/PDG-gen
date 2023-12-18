import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	 
	static final Scanner sc = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;
 
	static void solve() {
		String str = sc.next();
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				out.println(i + " " + (i+1));
				return;
			} else if(i-2>=0 && str.charAt(i)==str.charAt(i-2)) {
				out.println((i-1) + " " + (i+1));
				return;
			}
		}
		out.println("-1 -1");
	}
 
	public static void main(String[] args) {
		solve();

		out.flush();
		out.close();
	}
}