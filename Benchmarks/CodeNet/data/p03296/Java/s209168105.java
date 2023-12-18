import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int ans = 0;
		for(int i = 0;i < n;i ++) {
			b = in.nextInt();
			if(a == b)c ++;
			else {
				ans += c / 2;
				c = 1;
			}
			a = b;
		}
		System.out.println(ans);
	}

}
