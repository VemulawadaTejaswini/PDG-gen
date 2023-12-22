import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stack<String> s = new Stack<>();
			while (sc.hasNext()) {	
				String l = sc.nextLine();
				if ("0".equals(l)) {
					System.out.println(s.pop());
				} else {
					s.push(l);
				}
			}
			while(!s.isEmpty()) {
				System.out.println(s.pop());
			}
		}
	}
}