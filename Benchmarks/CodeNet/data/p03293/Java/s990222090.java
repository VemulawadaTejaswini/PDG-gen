import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		for (int i=0; i<s.length(); i++){
			if ((s.substring(i) + s.substring(0, i)).equals(t)){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		return;
	}
}