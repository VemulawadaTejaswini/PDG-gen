import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();

		if(l+2019<r) System.out.println(0);
		else System.out.println(l%2019 * (l+1)%2019);

	}
}
