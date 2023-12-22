
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			str = str.replaceAll("apple", "peach");
			System.out.println(str);
		}
	}
}
