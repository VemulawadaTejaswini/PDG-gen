import java.io.BufferedReader;
import java.io.InputStreamReader;

//üÍÍ¡ñ éÌÅAæÉfóâð·×ÄoµÄ¨­B
//public class Problem0009_PrimeNumber {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0009_PrimeNumber test = new Problem0009_PrimeNumber();
			Main test = new Main();
			test.setPrimeArray();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			
			while((line = reader.readLine()) != null) {
				int number = Integer.parseInt(line);
				
				System.out.println(test.getAnswer(number));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	int[] primeArray = new int[0];
	int getAnswer(int num) {
		int number = num;
		
		int high = primeArray.length - 1;
		int low = 0;
		while(low <= high) {
			int middle = (high + low) / 2;
			if(number == primeArray[middle]) {
				return middle + 1;
			} else if(number < primeArray[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return high + 1;
	}
	void setPrimeArray() {	
		primeArray = new int[78498];
		int count = 0;
		for(int i = 2; i < 1000000; i++) {
			if(isPrime(i)) {
				primeArray[count] = i;
				count++;
			}
		}
		if(primeArray[primeArray.length-1] == 0) {
			System.err.println("fÌª¨©µ¢");
		}
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