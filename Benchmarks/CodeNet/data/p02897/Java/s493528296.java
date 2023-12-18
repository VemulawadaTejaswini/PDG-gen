import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double a = N / 2;
		double b = N - a;

		double ans = b / N;

		System.out.println(ans);
	}
}
