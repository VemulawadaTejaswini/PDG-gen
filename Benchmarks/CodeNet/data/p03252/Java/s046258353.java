import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		String t = sc.next();
		sc.close();
		boolean f = true;
		HashMap<Character, Character> c = new HashMap<>();
		for(i=0;i<s.length();i++) {
			if(c.containsKey(t.charAt(i))) {
				if(!c.get(t.charAt(i)).equals(s.charAt(i))) {
					f = false;
					break;
				}
			} else {
				c.put(t.charAt(i), s.charAt(i));
			}
		}
		out.println(f?"Yes":"No");
	}
}
