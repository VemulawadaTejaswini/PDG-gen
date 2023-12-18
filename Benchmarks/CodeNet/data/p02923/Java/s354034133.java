import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int ans = 0;
		int temp = 0;
		int now = H[0];
		for(int i = 1; i < N; i++) {
			if(H[i] <= H[i - 1]) {
				now = H[i];
				temp++;
			} else {
				now = H[i];
				ans = Math.max(ans, temp);
				temp = 0;
			}
		}
		ans = Math.max(ans, temp);
		System.out.println(ans);
	}
}
