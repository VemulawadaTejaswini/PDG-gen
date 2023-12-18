import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String[] s = S.split("");
		int ans = 753;
		
		for(int i = 0; i <= s.length - 3; i++) {
			int data = Integer.valueOf(s[i] +
					s[i+1] + s[i+2]);
			int a = Math.abs(753 - data);
			ans = Math.min(ans, a);
		}
		System.out.println(ans);
	
	}
}
