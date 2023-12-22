import java.util.Scanner;

// ABC173-A
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int result = N % 1000;

		System.out.println(result);
		sc.close();
	}

}
