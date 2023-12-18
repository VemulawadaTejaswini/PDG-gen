import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] s = new String[N + 1];
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			s[i] = sc.next();
		}
		
		
		for(int i = 1; i <= N; i++) {
			String[] target = s[i].split("");
			Arrays.sort(target);
			
			for(int j = i + 1; j <= N; j++) {
				String[] comp = s[j].split("");
				Arrays.sort(comp);
				if(Arrays.equals(target, comp ) ) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}	
}