import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int ans1 = a*x+b*y;
		int ans2 = x>y ? y*2*c+(x-y)*a : x*2*c+(y-x)*b;
		int ans3 = x>y ? x*2*c : y*2*c;

		System.out.println(Math.min(Math.min(ans1, ans2), ans3));
	}

}
