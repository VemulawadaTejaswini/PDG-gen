import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max = Math.max(A-B, A+B);
		max = Math.max(max, A*B);
		System.out.println(max);
	}
}
