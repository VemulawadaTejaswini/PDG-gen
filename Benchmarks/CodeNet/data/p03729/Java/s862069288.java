import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		sc.close();
		boolean one = B.substring(0, 1).equals(A.substring(A.length() - 1, A.length()));
		boolean two = C.substring(0, 1).equals(B.substring(B.length() - 1, B.length()));
		if(one && two) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}