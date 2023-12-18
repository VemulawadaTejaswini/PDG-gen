import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long H = sc.nextInt(), W = sc.nextInt();

		/* divided by three rows or cols */
		long ans = (H % 3 == 0 || W % 3 == 0) ? 0 : Math.min(H, W);

		/* divided by one rows */
		for(long i = 1; i < H; i++) {
			long upper = i * W, lower_left = (H - i) * ((W + 1) / 2), lower_right = H * W - upper - lower_left;
			ans = Math.min(ans, Math.max(upper, Math.max(lower_left, lower_right)) - Math.min(upper, Math.min(lower_left, lower_right)));
		}

		/* divided by one cols */
		for(long i = 1; i < W; i++) {
			long left = i * H, right_upper = (W - i) * (H / 2), right_lower = H * W - left - right_upper;
			ans = Math.min(ans, Math.max(left, Math.max(right_upper, right_lower)) - Math.min(left, Math.min(right_upper, right_lower)));
		}
		System.out.println(ans);
	}
}