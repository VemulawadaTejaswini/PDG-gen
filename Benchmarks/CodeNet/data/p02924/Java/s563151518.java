import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		long m = ((n)*(n-1))/2;
		System.out.println(m);
	}
}
