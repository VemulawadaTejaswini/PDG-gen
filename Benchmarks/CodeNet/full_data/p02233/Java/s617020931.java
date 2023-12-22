mport java.util.Scanner;

class Main {
	static int Fibonacci (int n) {
		
		n = (int)((1 / Math.sqrt(5.0)) * 
				((Math.pow(((1.0 + Math.sqrt(5.0)) / 2.0), (double)n))
						- (Math.pow(((1.0 - Math.sqrt(5.0)) / 2.0), (double)n))));
		
		return n;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = Fibonacci (scan.nextInt());
		scan.close();
		System.out.println(n);
	}
}

