import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int total = 0;
		int cnt = 1;
		while(true) {
			total += cnt;
			cnt++;
			if(X <= total) {
				break;
			}
		}
		System.out.print(cnt-1);
	}
}