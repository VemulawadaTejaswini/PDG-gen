import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String A = sc.next();
        StringBuffer b = new StringBuffer(sc.next());
        String B = b.reverse().toString();
	   
        String ans = (A.equals(B))? "YES": "NO";
      	System.out.println(ans);
	}
}