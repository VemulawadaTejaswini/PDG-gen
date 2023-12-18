import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int x = N-2;
		int y = M-2;
		if(x == -1) N = 3;
		if(y == -1) M = 3;

		int a = Math.max(0, N-2);
		int b = Math.max(0, M-2);

		System.out.println(a*b);
	}

}
