import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		if (N % (D * 2 + 1) == 0) {
			System.out.println(N / (D * 2 + 1));
		} else {
			System.out.println(N / (D * 2 + 1) + 1);
		}
		sc.close();
	}
}