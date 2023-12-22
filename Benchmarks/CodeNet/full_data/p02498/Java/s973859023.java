import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String s,rev_s;
		rev_s = "";
		
		Scanner sc = new Scanner(System.in);
		String separator = System.getProperty("line.separator");
		sc.useDelimiter(separator);
		s = sc.next();
		
		for(int i = 0; i < s.length(); i++ ){
			
			char c;
			
			c = s.charAt(i);
			if ( Character.isLetter(c) != true ) {
				rev_s += c;
				continue;
			}
			
			if( Character.isUpperCase(c)){
				rev_s += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)){
				rev_s += Character.toUpperCase(c);
			}
		}
		System.out.println(rev_s);
	}
}