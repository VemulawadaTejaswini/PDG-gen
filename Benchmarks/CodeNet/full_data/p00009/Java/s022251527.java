import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0009_PrimeNumber {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0009_PrimeNumber test = new Problem0009_PrimeNumber();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			
			while((line = reader.readLine()) != null) {
				int number = Integer.parseInt(line);
				
				test.showAnswer(number);
			//	System.out.println(test.isPrime(25));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(int num) {
		int number = num;
		int result = 0;
		
		for(int i = 2; i < number + 1; i++) {
			if(isPrime(i)) {
			//	System.out.println(i + "\tÍf");
				result++;
			}
		}
		System.out.println(result);
	}
	boolean isPrime(int num) {
		if(num < 2) {
			return false;
		} else if(num == 2 || num == 3 || num == 5) {
			return true;
		} 
		if(num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		int primeCandidate = 5;
		for(int i = 0; primeCandidate <= Math.sqrt(num); i++) {
			if(num % primeCandidate == 0) {
				return false;
			}
			if(i % 2 == 0) {
				primeCandidate += 2;
			} else {
				primeCandidate += 4;
			}
		}
		return true;
	}
}