import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(!canTravel(t, x, y)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	static boolean canTravel(int t, int x, int y) {
		return (x+y)%2 == t%2 && (x+y) <= t;
	}
}