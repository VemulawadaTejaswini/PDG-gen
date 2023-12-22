import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		
		for (int i=1; i<=30; i++) {
			StringBuilder sb = new StringBuilder();
			char c;
			
			for (int j=0; j<s.length(); j++) {
				c = s.charAt(j);
				if ('a'<=c && c<='z') {
					c -= i;
					if (c < 97) {c += 26;}
				}
				sb.append(c);
			}
			
			if (sb.toString().contains("the") || sb.toString().contains("this") || sb.toString().contains("that")) {
                out.println(sb);
                break;
            }
			
			
//			if (sb.toString().matches(".*(the|this|that).*")) {out.println(sb); break;}
		}
	}
}
