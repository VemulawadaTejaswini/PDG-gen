import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong(), b = scanner.nextLong();
		
		String ans = "";
		if (a>b) {
			ans = "GREATER";
		}else if (a==b) {
			ans = "EQUAL";
		}else{
			ans = "LESS";
		}
		System.out.println(ans);
		
		scanner.close();
	}
}
