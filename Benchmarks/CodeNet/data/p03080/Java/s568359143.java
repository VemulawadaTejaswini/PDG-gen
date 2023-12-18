import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String s = sc.next();
		
		int r = 0;
		int b = 0;
		
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'R') {
				r++;
			}else{
				b++;
			}
		}
		
		System.out.println(b < r ? "Yes" : "No" );
	}
}
