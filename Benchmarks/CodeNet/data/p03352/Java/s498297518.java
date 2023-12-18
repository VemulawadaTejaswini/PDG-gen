import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = (int) Math.sqrt(x);
		System.out.println(i*i);
	}
}