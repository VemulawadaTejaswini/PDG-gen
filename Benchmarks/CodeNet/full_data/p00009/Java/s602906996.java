import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Prime {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int datasetCount = 0;
		
		while ((input = bf.readLine()) != null) {
			int primes = 0;
			

			
			if (++datasetCount >= 30) {
				break;
			}
		}
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); div += 1) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}