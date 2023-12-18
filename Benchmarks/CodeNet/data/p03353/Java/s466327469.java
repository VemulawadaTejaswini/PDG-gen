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
				strs.add(input.substring(i, j));
			}
		}
		Collections.sort(strs);

		int idx = 0;
		String buf = "";
		for(int i = 0; i < strs.size(); i++) {
			if(!buf.equals(strs.get(i))) {
				buf = strs.get(i);
				idx++;
			}
			if(idx == k) {
				System.out.println(strs.get(i));
				break;
			}
		}
	}
}
