import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] s = scanner.nextLine().toCharArray();
		char[] t = scanner.nextLine().toCharArray();
		String flg = "Yes";

		Map<Character, Character> map = new HashMap<>();

		for(int i = 0; i < t.length; i++) {

			if(!map.containsKey(t[i])) {

				map.put(t[i], s[i]);
			}else {

				if(map.get(t[i]) != s[i]) {

					flg = "No";
					break;
				}
			}

		}

		System.out.println(flg);
	}

}
