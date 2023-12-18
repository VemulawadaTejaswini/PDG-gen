import java.util.Scanner;
public class LuckySeven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean check = false;
		while (N != 0) {
			int a = N % 10;
			if (a == 7) {
				System.out.println("YES");
				check = true;
				break;
			}
			N /= 10;
		}
		if (check == false) {
			System.out.println("NO");
		}
	}
}