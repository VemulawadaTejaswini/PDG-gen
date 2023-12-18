import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int targetNumber = scanner.nextInt();
		
		boolean isPrimeNum = false;
		while(!isPrimeNum) {
			int num = targetNumber;
			isPrimeNum = IntStream.range(2, num).allMatch(n -> num % n != 0);
			if (isPrimeNum) {
				System.out.println(num);
			}else {
			 targetNumber++;
			}
		}

	}
	
	}

