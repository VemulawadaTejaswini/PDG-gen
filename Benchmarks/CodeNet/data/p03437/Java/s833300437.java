import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x == y) {
			System.out.println(-1);
			return;
		}
		for(int i = 1 ; i < 100000000 ; i++) {
			if(i % x == 0 && i % y != 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
