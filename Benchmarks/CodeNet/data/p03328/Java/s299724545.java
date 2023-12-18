import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int towerDiff = a - b;
		System.out.println(towerDiff + (towerDiff - 1) * (towerDiff) / 2 - a);
	}
}
