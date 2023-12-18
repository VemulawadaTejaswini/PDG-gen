import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int xa = X*2;
		if(X%Y == 0) {
			System.out.println(-1);
			return;
		}

		while(xa%Y == 0 && xa < Math.pow(10, 18)) {
			xa += X;
		}

		if(xa > Math.pow(10, 18)) {
			System.out.println(-1);
		}else {
			System.out.println(xa);
		}
	}
}
