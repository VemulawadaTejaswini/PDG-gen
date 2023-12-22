import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int datasetCount = 0;
		
		while ((input = bf.readLine()) != null) {
			int primes = 0;
			

			try {
				int n = Integer.parseUnsignedInt(input);
				
				if (n > 999999)
					continue;
				
				for (int i = 3; i <= n; i += 2) {
					
					if (isPrime(i))
						++primes;

					
				}
				

				System.out.print(primes);
				
				
			} catch (NumberFormatException nfe) {
				break;
			}
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