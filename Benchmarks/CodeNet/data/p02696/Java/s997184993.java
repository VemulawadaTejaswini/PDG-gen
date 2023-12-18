import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long n = sc.nextInt();
		long s = 0;
		
		if(n<b-1) {
			s = n;
		}else {
			s = b-1;
		}
		System.out.println(a*s/b);
	}
	
}
