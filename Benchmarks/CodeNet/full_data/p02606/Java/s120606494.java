import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		while(true) {
//			a.main(null);
//		}
		
		
		a.main(null);
		
	}

}

class a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		int d = scanner.nextInt();

		int count = (r - l) / d;
		if (r % d == 0) {
			count++;
		}
		
		if (r == l) {
			count=1;
		}

		System.out.println(count);

	}

}