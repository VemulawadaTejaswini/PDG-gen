import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println(-8);
		Scanner sc = new Scanner(System.in);
		char[] s1 = sc.next().toCharArray();
		int ans = 0;
		int now = 0;
		for(int i = 0; i < s1.length; i++) {
			if(s1[i] == '1') {
				if(now < 0) ans++;
				now++;
			}else {
				if(now > 0) ans++;
				now--;
			}
		}
		
		System.out.println(ans * 2);
	}
}