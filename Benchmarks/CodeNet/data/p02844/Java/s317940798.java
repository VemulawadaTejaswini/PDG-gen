import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[] s = in.next().toCharArray();
		int count = s.length;
		int num = 0;
		Set<String> ans = new HashSet<>();
		for (int i = 0; i < count - 2; i++) {
			for (int j = i + 1; j < count - 1; j++) {
				for (int k = j + 1; k < count; k++) {
					num++;
					StringBuilder sb = new StringBuilder();
					sb.append(s[i]);
					sb.append(s[j]);
					sb.append(s[k]);
					ans.add(sb.toString());
				}
			}
		}
		System.out.println(ans.size());
		in.close();
	}
}