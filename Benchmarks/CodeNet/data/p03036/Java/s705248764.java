import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, D;
		r = sc.nextInt();
		D = sc.nextInt();
		int x[] = new int[11];
		x[0]=sc.nextInt();
		sc.close();

		for (int i = 0; i < 10; i++) {
			x[i+1]= r * x[i] - D;
			System.out.println(x[i+1]);
		}
	}
}
