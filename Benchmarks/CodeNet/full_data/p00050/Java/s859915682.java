import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine().replaceAll("apple", "_").replaceAll("peach", "apple").replaceAll("_", "peach") );
	}
}