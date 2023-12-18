import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long s = 0;
		
		if(n<b-1) {
			s = n;
		}else {
			s = b-1;
		}
		System.out.println((a*s)/b);
	}
	
}
