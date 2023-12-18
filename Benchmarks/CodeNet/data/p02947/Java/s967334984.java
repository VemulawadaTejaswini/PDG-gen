import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		char[][] moji = new char[n][10];
		
		for(int i = 0; i < n; i++) {
			moji[i] = stdIn.next().toCharArray();
			Arrays.sort(moji[i]);
		}
		
		
		String[] tmp = new String[n];
		
		for(int i = 0; i < n; i++) {
			tmp[i] = String.valueOf(moji[i]);
		}
		
		Arrays.sort(tmp);
		

		
		long ans = 0;
		
		long cnt = 1;
		for(int i = 0; i < n-1; i++) {
			if(tmp[i].equals(tmp[i+1])) {
				cnt++;
			}else {
				ans += cnt*(cnt-1)/2;
				cnt = 1;
			}
			
			
			
		}
		if(cnt != 1) {
			ans += cnt * (cnt-1)/2;
		}
		
		System.out.println(ans);
		
		
	}

}