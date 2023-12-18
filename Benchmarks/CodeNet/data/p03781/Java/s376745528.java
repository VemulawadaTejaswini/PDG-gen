import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x = sc.nextInt();
		int t = 0;
		int cnt = 0;
		while (x > t) {
			cnt++;
			t += cnt;
		}
		System.out.println(cnt);
	}
}
