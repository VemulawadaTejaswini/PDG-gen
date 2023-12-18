import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner twonum = new Scanner(System.in);
		int n = twonum.nextInt();
		int m = twonum.nextInt();
		if (m == n) {
			if (n >= 1 && n <=100) {
				if (m >=0 && m <= n) System.out.println("Yes");
				else System.out.println("No");
			}
			else System.out.print("No");
		}
		else{
			System.out.println("No");
			}
	}

}