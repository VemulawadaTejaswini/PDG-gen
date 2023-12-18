import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		sc.close();
		boolean b = true; 
		
		for(int i=0; i<s.length()-1; i++) {
			char c = s.charAt(i);
			for(int j=i+1; j<s.length(); j++) {
				if(c==s.charAt(j)) {
					b = false;
					break;
				}
			}
		}
		
		if(b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
