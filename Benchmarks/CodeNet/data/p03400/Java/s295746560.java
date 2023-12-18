import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();
		int chocolate = x;
		int i = 0;
		int j = 0;
		for(i = 0; i < n; i++) {
			int a = scan.nextInt();
			int count = 0;
			for(j = 0; (j * a) + 1 <= d; j++) {
				count++;
			}
			chocolate = chocolate + count;
		}
		System.out.println(chocolate);
	}
}