import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int[] count = new int[128];
		int n = s.length;
		for(int i=0;i<n;i++) {
			count[s[i]]++;
		}
		int ans = 0;
		for(int i=0;i<128;i++) {
			ans += count[i] & 1;
		}
		System.out.println(ans + 1);
	}
}
