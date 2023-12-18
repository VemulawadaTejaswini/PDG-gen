import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i=1;
		while(n>=i) {
			i*=2;
		}
		System.out.println(i/2);

	}
}