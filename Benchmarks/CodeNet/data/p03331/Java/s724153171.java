import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer aInteger = 0;
		Integer bInteger = 0;
		Integer sum;
		Integer min = Integer.MAX_VALUE;
		Integer digitsSum  = new Integer(scanner.next());

		for(int i = 1; i < digitsSum;i++) {
			sum = 0;
			aInteger = i;
			bInteger = digitsSum - aInteger;
			while(aInteger != 0) {
				sum += aInteger % 10;
				aInteger /= 10;
			}
			while(bInteger != 0) {
				sum += bInteger % 10;
				bInteger /= 10;
			}
			if (min>sum) {
				min = sum;
			}
		}
		System.out.println(min);
		scanner.close();
	}
}