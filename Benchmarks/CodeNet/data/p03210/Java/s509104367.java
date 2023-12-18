import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		if (X == 3 || X == 5 || X == 7) System.out.print("YES");
		else System.out.print("NO");
	}
}