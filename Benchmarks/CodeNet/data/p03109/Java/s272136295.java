import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(in);
	    String str = sc.next();
	    str = str.replace("/","");
	    String ans =  (Integer.valueOf(str) > 20190430)? "TBD" : "Heisei";
		out.println(ans);
	}
}