import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			char ans = 'd';
			for(int i=0;i<3;i++) {
				if(s.charAt(3*i) != 's' && s.charAt(3*i) == s.charAt(3*i+1) && 
				   s.charAt(3*i) == s.charAt(3*i+2)) ans = s.charAt(3*i);
				if(s.charAt(i) != 's' && s.charAt(i) == s.charAt(3+i) &&
				   s.charAt(i) == s.charAt(6+i)) ans = s.charAt(i);
			}
			if(s.charAt(0) != 's' && s.charAt(0) == s.charAt(4) && 
			   s.charAt(0) == s.charAt(8)) ans = s.charAt(0);
			if(s.charAt(2) != 's' && s.charAt(2) == s.charAt(4) &&
			   s.charAt(6) == s.charAt(2)) ans = s.charAt(2);
			System.out.println(ans);
		}
	}
}