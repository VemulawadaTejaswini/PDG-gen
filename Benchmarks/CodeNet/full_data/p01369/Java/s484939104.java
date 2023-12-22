import java.util.*;
public class Main {
	static char[] l = new char[] {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			boolean isl = false;
			int counter = 0;
			String a = stdIn.next();
			if(a.equals("#")) break;
			if(isl(a.charAt(0))) isl = true;
			
			for(int i = 1; i < a.length(); i++) {
				boolean b = isl(a.charAt(i));
				if(isl && !b) {
					counter++;
					isl = false;
				}
				if(!isl && b) {
					counter++;
					isl = true;
				}
			}
			System.out.println(counter);
			
			
		}
	}
	public static boolean isl(char a) {
		for(int i = 0; i < l.length; i++) {
			if(l[i] == a) return true;
		}
		return false;
	}

}