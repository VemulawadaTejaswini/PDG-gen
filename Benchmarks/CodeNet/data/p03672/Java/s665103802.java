import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0; i <= s.length(); i += 2) {
			String s1 = s.substring(0, s.length()/2);
			String s2 = s.substring(s.length()/2, s.length());
				if(s1.equals(s2)) {
				System.out.println(s.length());
				return;	
				}else {
		    	s = s.substring(0, s.length()-2);
				} 
		 

		}

	}
}