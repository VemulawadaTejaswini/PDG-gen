import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static int nowPrime = 1;
	private static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.printf(n + ":");

		if(checkPrime(n)) {
			System.out.printf(" " + n);
		}
		else {
			while(n != 1) {
				setNextPrime();
				while(n % nowPrime == 0) {
					System.out.printf(" %d", nowPrime);

					n /= nowPrime;
				}
			}
		}
		System.out.println("");

		scan.close();
	}

	private static void setNextPrime() {
		while(true) {
			nowPrime++;
			if(checkNotMultiple(nowPrime)) {
				array.add(nowPrime);
				return;
			}
		}
	}

	private static boolean checkNotMultiple(int num) {
		for(int i = 0; i < array.size(); i++) {
			if(num % array.get(i) == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkPrime(int n) {
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
