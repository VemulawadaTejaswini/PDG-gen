import java.util.*;

public class Main {
	static int count(int[] s, int[] t) {
		int cnt = 0;
		for(int i = 0; i < t.length;i++) {
			for(int j = 0; j < s.length; j++) {
				if(t[i] == s[j]) {
					cnt++;
					t[i] = -1;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[sc.nextInt()];
		for(int i = 0;i < s.length;i++) {
			s[i] = sc.nextInt();
		}
		int[] t = new int[sc.nextInt()];
		for(int i = 0;i < t.length;i++) {
			t[i] = sc.nextInt();
		}
		int m = count(s,t);
		System.out.println(m);
	}
}