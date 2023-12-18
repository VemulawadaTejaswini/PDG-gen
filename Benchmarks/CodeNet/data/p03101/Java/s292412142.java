import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int h = sc.nextInt(), w = sc.nextInt();
		int sum = 0;
		sum = (H - h) * (W - w);
		System.out.println(sum);
	}
}