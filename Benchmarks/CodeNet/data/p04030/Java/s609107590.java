
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int p = 0; 
		char ans[];
		ans = new char[s.length()];
		
		for(int i = 0; i < s.length();++i) {
			if(s.charAt(i) == 'B') {
				ans[p] = ' ';
				if(p != 0)--p;
			}
			else ans[p++] = s.charAt(i);
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
