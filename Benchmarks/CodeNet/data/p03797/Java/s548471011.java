
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long M = scan.nextInt();
		int sum = 0;
		M += N * 2;
		while(true) {
			M -= 4;
			if(M >= 0) {
				sum++;
			} else {
				break;
			}
		}
		
		System.out.println(sum);
		
		scan.close();

	}

}
