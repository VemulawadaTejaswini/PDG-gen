import java.util.Scanner;

class Hoge {
	private static void print(String s) { System.out.print(s);}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num_primes = 0;
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if(isPrime(x)) num_primes++;
		}
		print(num_primes+"\n");
	}
	public static boolean isPrime(int x) {
		for(int i=2; i<x; i++) {
			if(x%i==0) return false;
		}
		return true;
	}

}
