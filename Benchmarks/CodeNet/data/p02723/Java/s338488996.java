import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char three = s.charAt(2);
		char four = s.charAt(3);
		char five = s.charAt(4);
		char six = s.charAt(5);
		
		if(three == four && five == six) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
