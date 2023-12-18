import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Character> list = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
		for(char c : s.toCharArray()) {
			list.remove(Character.valueOf(c));
		}
		if(list.isEmpty()) {
			System.out.println("None");
		} else {
			System.out.println(list.get(0));
		}
		sc.close();

	}

}
