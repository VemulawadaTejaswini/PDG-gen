import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean isAG = a % 2 == 0;
		boolean isBG = b % 2 == 0;
		boolean isCG = c % 2 == 0;
		if(isAG) {
			if(isBG) {
				if(isCG) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				if(isCG) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
		} else {
			if(isBG) {
				if(isCG) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			} else {
				System.out.println("YES");
			}
		}
	}
}