import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		for(int i = 1;;i++) {
			if(Math.pow(k, i) > n) {
				System.out.println(i);
				break;
			}
		}
	}
}