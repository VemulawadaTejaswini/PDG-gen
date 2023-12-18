import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] l = new int[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = Integer.parseInt(sc.next());
		}
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l.length; j++) {
				for (int j2 = 0; j2 < l.length; j2++) {
					if (i != j && i != j2 && j != j2) {
						int a = l[i];
						int b = l[j];
						int c = l[j2];
						if (a < b + c && b < c + a && c < a + b) {
							int[] t = { a, b, c };
							Arrays.sort(t);
							if (!map.containsKey(Arrays.toString(t))) {
								map.put(Arrays.toString(t), 1);
							}
						}
					}
				}
			}
		}
		System.out.println(map.size());
		sc.close();
	}
}