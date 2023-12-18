import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String S = scanner.next();
		
		scanner.close();

		for (int i = 0; i < S.length(); i++) {
			System.out.print('x');
		}
		System.out.println();
 		
	}
}