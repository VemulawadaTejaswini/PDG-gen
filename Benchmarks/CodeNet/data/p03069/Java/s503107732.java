
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String s = sc.next();
		
		
		int first = -1;
		int cnt = 0;
		boolean white = false;
		
		for(int i = 0 ; i < n ;i++) {
			if(first == -1 && s.charAt(i) == '#') {
				first = 1;
			}
			else if(first == 1 && s.charAt(i) == '.') {
				if(!white) {
				white = true;
				}
			}
			else if(first == 1 && white && s.charAt(i) == '#') {
				cnt++;
				white = false;
			}
		}
		if(white) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
