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
			if(A >= B && A >= C) {
				System.out.println(B * C);
			}else if(B >= A && B >= C) {
				System.out.println(C * A);
			}else if(C >= A && C >= B) {
				System.out.println(A * B);
			}
		}
	}

}
