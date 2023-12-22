import java.util.Scanner;


public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		String b = scan.next();
		b = b.replace(".", "");
		long f = Long.parseLong(b.substring(0, 1)) * a * 100;
		long s  = Long.parseLong(b.substring(1, 2)) * a * 10;
		long t = Long.parseLong(b.substring(2, 3)) * a;
		long temp = f + s + t; 
		// seisuu
		long ans =  (temp) /100;
		System.out.println(ans);
	}
}