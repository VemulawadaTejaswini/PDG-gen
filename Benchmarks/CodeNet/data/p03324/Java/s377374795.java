import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();
		int x = 0;

		if (D == 0)
			x = N;
		else if (D == 1)
			x = N * 100;
		else if (D == 2)
			x = N * 10000;
		System.out.println(x);
	}
}