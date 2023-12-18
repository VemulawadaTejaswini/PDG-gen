import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer S = new StringBuffer(sc.next());
		StringBuffer T = new StringBuffer(sc.next());
		sc.close();
		System.out.println(T.append(S));

	}
}