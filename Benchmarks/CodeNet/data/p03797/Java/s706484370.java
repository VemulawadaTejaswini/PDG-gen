import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-2*n > 0) {
			System.out.println(n + (m-2*n)/4);
		}else if(m - 2*n == 0) {
			System.out.println(m);
		}else {
			System.out.println(n/2);
		}
	}
}
