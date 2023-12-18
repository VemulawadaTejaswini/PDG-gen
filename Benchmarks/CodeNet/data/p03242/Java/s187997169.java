
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = A.replace("1", "2");
		String C = B.replace("9", "3");
		String D = C.replace("2", "9");
		String E = D.replace("3", "1");
		System.out.println(E);
	}
}
