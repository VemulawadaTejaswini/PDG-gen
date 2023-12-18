import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt();
		int A = scan.nextInt();
		int count = 0;

		while(H > 0) {
			H-=A;
			count++;
		}

		System.out.println(count);
	}
}
