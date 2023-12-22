import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		scan.close();
		
		long b = -1000;
		while(true) {
			long a = x + (long)Math.pow(b, 5);
			if(is5root(a)) {
				System.out.println((long)Math.pow(a, 0.2) + " " + b);
				return;
			}
			b++;
		}
		
	}
	
	public static boolean is5root(long a) {
		long b = (long)Math.pow(a,0.2);
		long c = (long)Math.pow(b, 5);
		return a == c;
	}

}
