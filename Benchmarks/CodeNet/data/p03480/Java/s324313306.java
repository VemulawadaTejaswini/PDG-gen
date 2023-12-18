
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n=s.length();
		int ans = n;
		for(int i=0; i<n-1; i++) {
			if(s.charAt(i) != s.charAt(i+1)) {
				ans = Math.min(ans, Math.max(i+1, n-i-1));
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
