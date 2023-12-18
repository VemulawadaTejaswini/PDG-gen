
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int K = scan.nextInt();
		int max = 0;
		int count = 0;

		if (A >= B) {
			max = A;
		} else {
			max = B;
		}

		for (int i = 1; i <= max; i++) {
			if(A%i==0 && B%i==0) {
				count++;
				if(count==K) {
					System.out.println(i);
					break;
				}
			}
		}
		scan.close();
	}
}
