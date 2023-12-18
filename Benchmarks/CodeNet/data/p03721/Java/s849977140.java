import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] num = new int[100010];
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			num[a] += b;
		}
		for(int i = 0 ; i < 100010 ; i++) {
			if(k <= num[i]) {
				System.out.println(i);
				return;
			} else {
				k -= num[i];
			}
		}
	}
}
