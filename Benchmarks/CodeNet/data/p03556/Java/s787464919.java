import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = (int) Math.sqrt(n);
		System.out.println(temp * temp);
	}
}