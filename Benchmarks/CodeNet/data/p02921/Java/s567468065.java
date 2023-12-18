import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		String t = sc.next();
		sc.close();
		int cnt=0;
		for (i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t.charAt(i)) {
				cnt++;
			}
		}
		out.println(cnt);
	}
}
