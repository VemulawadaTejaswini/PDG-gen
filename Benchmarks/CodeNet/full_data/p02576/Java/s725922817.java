import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		int result = (N / X) * T;

		if(N % X > 0) {
			result =+ T;
		}

		System.out.println(result);

	}

}