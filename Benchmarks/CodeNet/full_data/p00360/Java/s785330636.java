import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt();
		
		int cur = 0;
		while(k > 0) {
			int place = cur;
			char min = s[cur];
			for(int i = cur + 1; i <= Math.min(cur + k, s.length - 1); i++) {
				if(min > s[i]) {
					min = s[i];
					place = i;
				}
			}
			
			for(int i = place - 1; i >= cur; i--) {
				s[i + 1] = s[i];
			}
			s[cur] = min;
			
			k -= place - cur;
			cur++;
		}
		
		System.out.println(String.valueOf(s));
	}
}
