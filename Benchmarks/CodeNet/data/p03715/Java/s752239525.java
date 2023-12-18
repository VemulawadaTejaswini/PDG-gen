import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		if(H % 3 == 0 || W % 3 == 0)
			ans = 0;
		int a, b, c;
		for(int i = 0; i <= 1; i++) {
			a = (W/3+i)*H;
			b = (W-i-W/3)*(H/2);
			ans = Math.min(ans, Math.abs(a-b));
			a = (H/3+i)*W;
			b = (H-i-H/3)*(W/2);
			ans = Math.min(ans, Math.abs(a-b));
			if(H % 2 == 1) {
				a = (W-i-W/3)*(H/2+1);
				b = (W-i-W/3)*(H/2);
				ans = Math.min(ans, Math.abs(a-b));
			}
			if(W % 2 == 1) {
				a = (H-i-H/3)*(W/2+1);
				b = (H-i-H/3)*(W/2);
				ans = Math.min(ans, Math.abs(a-b));
			}
		}
		System.out.println(ans);
	}

}