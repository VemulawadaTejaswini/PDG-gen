import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	int B = scan.nextInt();
	int C = scan.nextInt();
	int D = scan.nextInt();

	int first = 0;
	int last = 0;

	if (A > C) {
		first = A;
	}else {
		first = C;
	}

	if (B > D) {
		last = D;
	}else {
		last = B;
	}
	if (last > first) {
		System.out.println(last - first);
	}else {
		System.out.println(0);
	}
	}
}