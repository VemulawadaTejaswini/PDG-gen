
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long h  = sc.nextLong();
		sc.close();
		long num = 1;
		while(h > 1) {
			h = h/2;
			num+=1;
		}
		System.out.println((long)(Math.pow(2, num)-1));
		
	}

}