import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long[]a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextLong();
		}
		
		long[]s = new long[n+1];
		Arrays.fill(s, 0);
		
		for(int i = 1; i < n+1; i++) {
			s[i] = s[i-1] + a[i-1];
			
		}
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n+1; j++) {
				if(s[j] - s[i] == 0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
