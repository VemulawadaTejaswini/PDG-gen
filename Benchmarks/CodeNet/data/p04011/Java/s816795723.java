import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int cost = 0;
		for(int i = 0; i < n; i++) {
			if(i < k) {
				cost = cost + x;
			} else {
				cost = cost + y;
			}
		}
		System.out.println(cost);
	}
}