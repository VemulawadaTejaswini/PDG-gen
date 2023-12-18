import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int hikari = 1;
		int cnt = 0;
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i++) {
			if(hikari == i + 1) {
				hikari = a[i];
				cnt++;
				if(hikari == 2) {
					System.out.println(cnt);
					break;
				}
			}
			if(i == N - 1) {
				System.out.println("-1");
			}
		}
	}
}
