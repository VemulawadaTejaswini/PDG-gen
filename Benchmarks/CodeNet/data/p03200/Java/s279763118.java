import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int count = 0;
		long ans = 0;
		for(int i = 0; i < s.length(); i++) {
			if(c[i]=='W') {
				ans += i-count;
				count++;
			}
		}
		System.out.println(ans);
	}
}