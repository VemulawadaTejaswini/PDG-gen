import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();
		char c[] = new char[n];
		int ans = 0;
		int r = 0;
		int w = 0;
		
		for(int i=0;i<n;i++) {
			c[i] = s.charAt(i);
			if(c[i] == 'R') {
				r++;
			}
		}
		
		for(int i=0;i<r;i++) {
			if(c[i] == 'W') {
				ans++;
			}
		}
		
		
		System.out.println(ans);
	}

}
