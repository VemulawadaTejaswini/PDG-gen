import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
      	String b = scn.next();
      	String c = scn.next();
      	String ans = "NO";
      	if(a.charAt(a.length()-1)==b.charAt(0) && b.charAt(b.length()-1)==c.charAt(0)) ans = "YES";
      	System.out.println(ans);
      	
	}
}