import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Main{
	
	public static void main(String[] args) {
	
		Scanner datasets = new Scanner(System.in);

String input;
		int datasetCount = 0;
		
		while (datasets.hasNextLine()) {
			
			int primes = 0;
			input = datasets.nextLine();
			try {
				int n = Integer.parseUnsignedInt(input);
				
				if (n > 999999)
					continue;
				
				for (int i = 2; i <= n; ++i) {
					
					if (isPrime(i))
						++primes;
					
				}
				
				System.out.print(primes + "\n");
				
				
			} catch (NumberFormatException nfe) {
				break;
			}
			if (++datasetCount >= 30) {
				break;
			}
		}
		datasets.close();
	}
}