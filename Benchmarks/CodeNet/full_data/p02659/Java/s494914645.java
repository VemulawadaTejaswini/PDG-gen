import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();

		//小数第1位で四捨五入
		System.out.println(Math.round(a*b));
	}
}