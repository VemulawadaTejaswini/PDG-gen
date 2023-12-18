import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long blue = sc.nextLong();
		long red = sc.nextLong();
		
		long s = n / (blue + red);
		long k = n - s * (blue + red);
		
		if(k >= blue) {
			System.out.println(blue * (s + 1));
		}else {
			System.out.println(blue * s + k);
		}
	}
	
}
