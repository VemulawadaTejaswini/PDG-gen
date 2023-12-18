import java.util.*;
public class Main {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(core(s));
	}
	
	static String core(String s) {
		char a = s.charAt(0);
		a++;
		
		
		char cs[] = new char[1];
		cs[0]=a;
		return new String(cs);
	}	
}