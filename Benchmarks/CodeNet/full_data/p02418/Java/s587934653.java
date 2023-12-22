import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		String p = stdIn.next();
		
		boolean ans = false;
		
		IN:for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < p.length(); j++) {
				if(s.charAt((i + j) % s.length()) != p.charAt(j)) {
					continue IN;
				}
			}
			ans = true;
			break;
		}
		
		System.out.println((ans)?"Yes":"No");
		
	}
}