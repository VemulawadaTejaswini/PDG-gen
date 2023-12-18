import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < x; i++) {
			if(i == 0) ans = 100;
			else ans *= 100;
		}

		System.out.println(ans * y);
	}
}