import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		int N = s.length;
		
		int[] count = new int[2019];
		
		count[0] = 1;
		int mod = 0;
		int base = 1;
		long ans = 0;
		for(int i=N-1; i>=0; i--) {
			mod = (mod + base*(s[i]-'0'))%2019;
			ans += count[mod];
			count[mod]++;
			base = (base*10)%2019;
		}

		System.out.println(ans);
		sc.close();
	}
}
