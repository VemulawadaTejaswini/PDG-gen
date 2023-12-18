import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sba = new StringBuilder();
		StringBuilder sbb = new StringBuilder();
		for(int i =0; i < b; i++) {
			sba.append(String.valueOf(a));
		}

		for(int i =0; i < a; i++) {
			sbb.append(String.valueOf(b));
		}

		String stringA = sba.toString();
		String stringB = sbb.toString();

		if(a < b) {
			System.out.println(stringA);
		}else {
			System.out.println(stringB);
		}
	}
}