import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(),w = sc.nextInt(),o = sc.nextInt();
		double sum = h * w * 0.5;
		System.out.println((int)sum);
	}
}