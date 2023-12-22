import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		long mul=1;
		while(n-->0) {
			long a=scan.nextLong();
			mul*=a;
			
		}
		if(mul>1000000000000000000L) {
			System.out.println("-1");
			return;
		}
		System.out.println(mul);
	}

}
