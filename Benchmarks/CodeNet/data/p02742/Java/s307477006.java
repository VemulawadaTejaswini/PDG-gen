import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		long h=scan.nextInt();
		long w=scan.nextInt();
		if(h*w%2==0) {
			System.out.println(h*w/2);
		} else {
			System.out.println(h*w/2+1);
		}
 	}

}
