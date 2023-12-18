import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());

		double c = (T+0.5)/A * B;
		int a =(int) c /B;
		System.out.println(a*B);

	}
}
