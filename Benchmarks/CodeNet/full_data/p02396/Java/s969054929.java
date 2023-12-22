import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = 1;
		while (true) {
			int i = sc.nextInt();
			if (i == 0) {
				break;
			}
			System.out.println("Case " + no + ": " + i);
			no++;
		}
	}
}