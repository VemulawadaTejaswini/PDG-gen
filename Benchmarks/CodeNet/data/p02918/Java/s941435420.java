import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String s = sc.next();
		int m = 0;
		int l = 0;
		int ans = 0;
		
		for(int i = 0 ; i < n-1 ; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				m++;
			}
			if(s.charAt(i) != s.charAt(i+1)) {
				l++;
			}
		}
		if(2 * k <= l) {
			ans += (2 * k) + m ;
		}
		if(2 * k > l) {
			ans += m + l;
		}
		System.out.println(ans);

	}
}
