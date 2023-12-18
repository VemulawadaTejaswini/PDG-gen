
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char s[] = sc.next().toCharArray();

		int ans = Integer.MAX_VALUE;
		for(int m=0; m<n; m++) {
			int cnt=0;
			for(int i=0; i<m; i++) {
				if(s[i] == 'W') cnt++;
			}
			for(int i=m+1; i<n; i++) {
				if(s[i] == 'E') cnt++;
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
		sc.close();
	}
}
