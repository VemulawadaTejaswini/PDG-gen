import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] corrects = new String[]{"AKIHABARA", "KIHABARA", "AKIHBARA", "AKIHABRA", "AKIHABAR", "KIHBARA", "KIHABRA", "KIHABAR", "AKIHBRA", "AKIHBAR", "AKIHABR", "KIHBRA", "KIHBAR", "KIHABR", "AKIHBR", "KIHBR"}; 
		for (String s : corrects) {
			if (input.equals(s)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
