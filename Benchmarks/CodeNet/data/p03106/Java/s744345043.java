import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int k = 1;
		int ans = 1;
		while(cnt != K) {
			if(A % k == 0 && B % k == 0) {
				cnt++;
				ans = k;
			}
			k++;
		}
		System.out.println(ans);
	}
}