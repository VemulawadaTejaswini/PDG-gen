import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int ans = 0;
		for(int i = 1;i <= n;i++) {
			int tmp = i;
			sum = 0;
			while(tmp >= 1) {
				sum += tmp % 10;
				tmp = tmp / 10;
			}
			if(sum >= a && sum <= b) {
				ans += i;
			}
		}
		System.out.println(ans);
        sc.close();
	}
}