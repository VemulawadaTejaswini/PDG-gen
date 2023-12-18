import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String a = "No";
		if (n < 4)
			a = "No";
		else {
			int k = n / 7 + 1;
		
			for (int i = 0; i < k + 1; i++) {
				double m = (n - 7 * i) / 4.0;
				int l = (n - 7 * i) / 4;
				if (m == l) {
					a = "Yes"; 
					break;
				}
			}
		}
		System.out.println(a);

	}
}

