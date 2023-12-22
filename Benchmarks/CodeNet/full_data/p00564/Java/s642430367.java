import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int a = sc.nextInt();
	static int b = sc.nextInt(); // set_x
	static int c = sc.nextInt();
	static int d = sc.nextInt(); // set_y
	public static void main(String[] args) {
		pencil();

	}
	private static void pencil() {
		int[] num = new int[] {a, c};
		int[] price = new int[] {b, d};
		int[] total = new int[2] ;

			for(int i = 0; i < 2; i++) {
				if (n % num[i] == 0) {
					total[i] = price[i] * (n / num[i]);
				} else {
					total[i] = price[i] * ((n / num[i]) + 1);
				}
			}
		System.out.println(Math.min(total[0], total[1]));
	}

}
