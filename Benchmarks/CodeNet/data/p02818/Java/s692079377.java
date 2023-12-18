import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();

		long temp = a + b;

		if(k > temp) {
			System.out.println(0);
		}else if(k >= a) {
			System.out.println(0 + " " + (temp - k));
		}else {
			System.out.println((a - k) + " " + (b));
		}
	}
}