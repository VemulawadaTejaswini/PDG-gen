import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String[]> s = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String[] tmp = sc.next().split("");
			Arrays.sort(tmp);
			s.add(tmp);
		}
		int ans = 0;
		for (int i = 0; i < s.size() - 1; i++) {
			for (int j = i + 1; j < s.size(); j++) {
				if (Arrays.equals(s.get(i), s.get(j)))
					ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}