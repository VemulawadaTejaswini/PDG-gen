import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String str = s + s;
		String ans = scanner.nextLine();
		
		if(str.contains(ans)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}