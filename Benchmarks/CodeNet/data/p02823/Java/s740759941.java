
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans;
		int diff = Math.abs(A - B);
		int min = Math.min(A, B);
		int max = Math.max(A, B);
	if( diff >= 2 ) {
		if(diff % 2 != 0) {
			ans = diff/2 + 1;
		}else {
			ans = diff/2;
		}
	}else {
		if(min -1 < N - max) {
			ans = max - 1;
		}else {
			ans = N -min;
		}
	}
	
	System.out.println(ans);
}
	}