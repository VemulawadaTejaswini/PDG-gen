import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] s = new int[sc.nextInt()];
	for(int i = 0; i < s.length; i++) {
		s[i] = sc.nextInt();
	}
	int cnt = 0;
	int n = sc.nextInt();
	for(int i = 0;i < n; i++) {
		int t = sc.nextInt();
		for(int j = 0; j < s.length; j++) {
			if(s[j] == t) {
				cnt++;
				t = -1;
			}
		}
	}
	System.out.println(cnt);
	}
}