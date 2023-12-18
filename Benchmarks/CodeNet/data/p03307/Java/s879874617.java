import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextInt();

		if(n%2==0) {
			System.out.print(n);
		}
		else {
			System.out.print(n*2);
		}
	}

}
