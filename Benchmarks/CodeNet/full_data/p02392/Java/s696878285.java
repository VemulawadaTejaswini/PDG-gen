import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a<b&&b<c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}

}
