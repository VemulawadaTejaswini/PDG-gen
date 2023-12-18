
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());

		int a = N / (2*D + 1);
		int b = N % (2*D + 1);
		if(b == 0) {
			System.out.println(a);
		} else {
			System.out.println(a+1);
		}
	}

}
