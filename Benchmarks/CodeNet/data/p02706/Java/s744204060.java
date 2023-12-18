import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int list[] = new int[Y];
		for (int i = 0; i < Y; i++) {
			list[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < Y; i++) {
			sum += list[i];
		}

		int ans = X - sum;

		if(ans<0) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}

	}
}
