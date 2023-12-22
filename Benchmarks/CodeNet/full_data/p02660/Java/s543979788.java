import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		int count = 0;
		int z = 0;
		int p = 0;
		int sousa = 0;
		long x = N;
		
		if(N == 1) {
			System.out.println(0);
			System.exit(0);
		}
		
		for(int i=2; i<=Math.sqrt(N);) {
			if(x % i == 0) {
				x /= i;
				count++;
			}
			else {
				i++;
			}
		}
		
		if(x == 1) {
			System.out.println(count);
		}
		else {
			System.out.println(1);
		}
	}
}