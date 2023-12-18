import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char b = sc.next().charAt(0);
		char ans = '\u0000';
		switch (b) {
		case 'A':
			ans = 'T';
			break;
		case 'C':
			ans = 'G';
			break;
		case 'G':
			ans = 'C';
			break;
		case 'T':
			ans = 'A';
			break;
		}

		System.out.println(ans);

		sc.close();
	}
}
