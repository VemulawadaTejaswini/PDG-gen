import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int A = reader.nextInt();
		int B = reader.nextInt();
		int ans = Math.max(A+A-1, B+B-1);
		ans = Math.max(ans, A+B);


		System.out.print(ans);
		reader.close();

	}

}



