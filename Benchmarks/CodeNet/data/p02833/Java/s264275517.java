import java.util.Scanner;
public class Main {
	static int count = 0;
	static int cnt(long n) {
		long b = n;
		while(b % 5 == 0) {
			count++;
			b/=5;
		}
		while(n >= 2) {	
			n-=2;
		    cnt(n);
		}
		return count;
		
	}



	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long  n = stdIn.nextLong();
		if(n%2 != 0) {
			System.out.println(0);
			System.exit(0);
		}

		int a = cnt(n);
		
		System.out.println(a);

	}

}
