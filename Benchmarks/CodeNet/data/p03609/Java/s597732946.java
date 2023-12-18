import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long t = sc.nextLong();
		if(X>t) {
			System.out.println(X-t);
		} else {
			System.out.println(0);
		}
	}

}