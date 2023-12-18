import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = 0;
		int B = 0;
		if(N == 2) {
			A = Integer.parseInt(sc.next());
			B = Integer.parseInt(sc.next());
		}


		sc.close();
		if(N == 1) {
			System.out.println("Hello World\r\n" +
					"");
		}else if(N == 2) {
			System.out.println(A + B);
		}
	}
}