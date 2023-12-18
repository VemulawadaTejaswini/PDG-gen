
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String s = sc.next();
		
		
		int first = -1;
		int cnt = 0;
		boolean white = false;
		
		int w = 0;
		int b = 0;
		
		for(int i = 0 ; i < n ;i++) {
			if(s.charAt(i)== '#') {
				b++;
			}
			if(s.charAt(i)== '.')
				w++;
		}
		
		int temp = Math.min(b, w);
		
		for(int i = 0 ; i < n ;i++) {
			if(first == -1 && s.charAt(i) == '#') {
				first = 1;
			}
			else  if(first == 1 && s.charAt(i) == '.') {
				cnt++;
			}
		}

		
		int ans = Math.min(temp, cnt);
		
		System.out.println(ans);
	}
}
