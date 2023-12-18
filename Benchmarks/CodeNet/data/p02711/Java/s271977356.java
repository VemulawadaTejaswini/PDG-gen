import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		String N = scanner.next();

		
		if(N.contains("7")) {
			System.out.println("Yes");			
		}
		else {
			System.out.println("No");	
		}

		scanner.close();

	}
}