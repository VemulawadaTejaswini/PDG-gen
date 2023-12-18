import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		boolean flag = true;
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if(a.contains(b)) {
				flag = false;
				break;
			}else {
				a.add(b);
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}