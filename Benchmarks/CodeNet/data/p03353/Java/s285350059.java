import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int k = sc.nextInt();
		ArrayList<String> strs = new ArrayList<String>();
		for(int i = 0; i < input.length(); i++) {
			for(int j = i+1; j <= input.length(); j++) {
				if(!strs.contains(input.substring(i, j))) {
					strs.add(input.substring(i, j));
				}
			}
		}
		Collections.sort(strs);

		System.out.println(strs.get(k-1));
	}
}
