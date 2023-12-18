import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		long bisket = 1;
		int money = 0;

		if (B - A <= 2)  {
			bisket += K;
			System.out.println(bisket);
			return;
		}

		for (int i = 0; i < K; i++) {
			//残り2回以上操作ができる かつ ビスケットがA枚以上ある
			if (K >=2 && bisket >= A) {
				i++;
				bisket = bisket - A + B;
			} else {
				bisket++;
			}
		}
		System.out.println(bisket);
	}
}
