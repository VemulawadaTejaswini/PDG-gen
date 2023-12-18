import java.util.*;

public class a2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();

		System.out.println(A % B == 0 ? A + B : A - B);
	}
}