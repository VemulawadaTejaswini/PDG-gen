class Prime {
	
	public static void main(String[] a) {
	
		String input;
		int datasetCount = 0;
		
		for (int dataset = 0; dataset < a.length; ++dataset) {
			
			int primes = 0;
			input = a[dataset];
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
				return;
			}
		}
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); ++div) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}