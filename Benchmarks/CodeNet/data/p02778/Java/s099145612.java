import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		for(int i=0; i<S.length()-1; i++) {
			System.out.print("x");
		}
	}

}