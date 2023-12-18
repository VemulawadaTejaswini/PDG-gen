import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Boolean> a = new HashMap<Integer, Boolean>();
		boolean flag = true; int b = 0;
		for (int i = 0; i < n; i++) {
			b = sc.nextInt();
			if(a.containsKey(b)) {
				flag = false;
				break;
			}else {
				a.put(b, true);
			}
		}
		if(flag)System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
}