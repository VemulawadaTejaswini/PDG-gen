import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(),
		result = line.replace("apple", "#apple#").replace("peach","apple").replace("#apple#","peach");
		System.out.println(result);
	}
}