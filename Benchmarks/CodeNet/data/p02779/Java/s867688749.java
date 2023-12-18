import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> stList = new ArrayList<>();
		String result = "YES";
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			String st = String.valueOf(num);
			if (stList.contains(st)) {
				result = "NO";
			}
			stList.add(st);
		}
		sc.close();
		System.out.println(result);
	}
}