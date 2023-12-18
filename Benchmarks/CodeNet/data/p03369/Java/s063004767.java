import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

        String menu = S.replace("x", "");
        int add = menu.length(); 

        System.out.println(700 + 100 * add);
	}
}
