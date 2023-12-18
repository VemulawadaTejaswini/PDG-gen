import java.util.Scanner;

public class Main {

	static long sum = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		attack(n);
		System.out.println(sum);
	}

	public static void attack(double n) {
		sum++;
		if(n == 1) {
			return;
		}
		double devided = Math.floor(n / 2);
		attack(devided);
		attack(devided);
	}

}