import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		double a = 100;
		int count = 0;
		boolean b = true;
		
		while(b) {
			a = a + a * 0.01;
			a = Math.floor(a);
			count++;
			if(a >= x) {
				b = false;
			}
		}
		System.out.println(count);

	}

}
