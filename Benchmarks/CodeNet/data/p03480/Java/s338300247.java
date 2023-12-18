
import java.util.*;
import java.util.Map.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();
		int n = c.length;

		int ans = n;
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j<=i-1; j++) {
				if(j==n-i)continue;
				if(c[j] != c[j-1]) {
					ans = i-1;
					System.out.println(ans);
					sc.close();
					return;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
