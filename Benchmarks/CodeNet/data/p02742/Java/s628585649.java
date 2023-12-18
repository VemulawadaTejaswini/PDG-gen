import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		long h=scan.nextInt();
		long w=scan.nextInt();
		long sum =0;

		if(h*w%2==0) {
			System.out.println(h*w/2);
		} else {
			System.out.println((long)Math.floor(h*w/2)+1);
		}
 	}

}
