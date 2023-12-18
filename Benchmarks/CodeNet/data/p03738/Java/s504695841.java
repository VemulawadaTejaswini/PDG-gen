import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		String ans ="";
		if (a>b) {
			ans = "GREATER";
		}else if (b<a) {
			ans = "LESS";
		}else {
			ans = "EQUAL";
		}
		
		System.out.println(ans);
		scanner.close();
	}
	
}