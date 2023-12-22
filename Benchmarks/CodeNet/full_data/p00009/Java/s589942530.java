
class Main {
	
	public static void main(String[] args) {
	
		
		String input;
		int datasetCount = 0;
		
		for (int dataset = 0; dataset < args.length; ++dataset) {
			
			int primes = 0;
			
			
		}
		datasets.close();
		
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); ++div) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}