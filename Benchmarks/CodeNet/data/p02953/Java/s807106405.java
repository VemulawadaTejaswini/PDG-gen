import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<Integer>();
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			List.add(scan.nextInt());
		}
		List.add(1000000000);
//		System.out.println(List);
		for (int i = 0; i < n; i++) {
			if (List.get(i) > List.get(i+1)) {
				List.set(i, List.get(i) - 1);
			}
		}
//		System.out.println(List);
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			if (List.get(i) > List.get(i+1)) {
				ans = false;
				break;
			}
		}
		if(ans) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}