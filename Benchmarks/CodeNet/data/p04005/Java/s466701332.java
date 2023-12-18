import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A =Integer.parseInt(sc.next());
		int B =Integer.parseInt(sc.next());
		int C =Integer.parseInt(sc.next());

		if(A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		}else {
			int min = Math.min(A * B, B * C);
			min = Math.min(min, C * A);
			System.out.println(min);
		}
	}

}
