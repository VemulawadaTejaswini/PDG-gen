import java.util.*;
public class Main {
	static int ans = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		long ans = 0;
		long sum_b = 5;
		long sum = 3;
		for(int i = 1; i < N; i++) {
			long temp_b = sum_b;
			long temp = sum;
			sum_b = temp_b * 2 + 3;
			sum = temp * 2 + 1;
		}
		
		int cnt = N;
		while(cnt >= 1) {
			if(cnt == 1) {
				switch((int)X) {
				case 1:
					break;
				case 2:
					ans += 1;
					break;
				case 3:
					ans += 2;
					break;
				case 4:
					ans += 3;
					break;
				default:
					ans += 3;
					break;
				}
				break;
			}
			if(X > (sum_b + 1) / 2) {
				ans += (sum - 1) / 2 + 1;
				X -= (sum_b / 2 + 2);
			} else if(X == (sum_b + 1) / 2) {
				ans += (sum - 1) / 2 + 1;
				System.out.println(ans);
				return;
			}
			sum_b = sum_b / 2 - 1;
			sum = sum / 2;
			cnt--;
		}
		System.out.println(ans);
	}
}
