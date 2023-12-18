import java.util.*;
/**
 * Base_version
 */ 
class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
    sc.close();
	String a = "";
	for(int i=1; i<=s.length(); i+=2) {
		a += String.valueOf(s.charAt(i-1));
	}
	System.out.println(a);
	}
}