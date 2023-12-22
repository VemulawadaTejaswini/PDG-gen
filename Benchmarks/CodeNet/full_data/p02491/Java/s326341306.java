import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int syo;
		int amr;
		double ten;
		syo = a / b;
		amr = a % b;
		ten = (double)a / (double)b;
		System.out.printf("%d %d %.5f", syo, amr, ten);
	}
}