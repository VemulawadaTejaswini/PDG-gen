import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i=1;;i++) {
			if(i*i > n) {
			System.out.println((i-1)*(i-1));
				break;
			}
		}
	}
}
