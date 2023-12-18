import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		
		System.out.println(isHitachi(s) ? "Yes" : "No");
		
		sc.close();
	}
	
	static boolean isHitachi(char[] s) {
		if(s.length%2!=0)
			return false;
		for(int i=0; i<s.length/2; i++) {
			if(s[i*2]!='h')
				return false;
			if(s[i*2+1]!='i')
				return false;
		}
		return true;
	}
}
