import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		// 奇数
		if(n%2 == 1 && (n+1)/2 >= k) {
			System.out.println("YES");
		}
		// 偶数
		else if(n%2 == 0 && n/2 >= k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
