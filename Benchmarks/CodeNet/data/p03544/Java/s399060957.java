import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long a=2,b=1,c=0;
		for(long i=1; i<n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}
}
