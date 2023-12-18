import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char s[] = new char[n];
		String str = sc.nextLine();
		for(int i = 0; i < n; i++) {
			s[i] = str.charAt(i);
		}
		int ans = 1;
		
		for(int i = 1; i < n; i++) {
			if(s[i] != s[i -1]) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
