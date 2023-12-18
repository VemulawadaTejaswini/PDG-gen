import java.util.*;
 
public class Main {
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[]$) {
		int compare = scanner.next().compareTo(scanner.next());
		System.out.println(compare == 1 ? "GREATER" : compare == 0 ? "EQUAL" : "LESS");
	}
}