import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp1 = sc.nextInt();
		int tmp2 = sc.nextInt();
		int a = Math.min(tmp1, tmp2);
		int b = Math.max(tmp1, tmp2);

		long cnt = 0;
		if(a == 1) {
			if(b == 1) {
				cnt = 1;
			} else {
				cnt =  b - 2;
			}
		} else {
			cnt = (b - 2) * (a - 2);
		}
		System.out.println(cnt);
	}
}
