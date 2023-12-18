import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Long> List = new ArrayList<Long>();
		long n = scan.nextLong();
		for(int i = 0; i < n; i++) {
			List.add(scan.nextLong());
		}
		List.add(Long.valueOf(1999999999));
//		System.out.println(List);
		for (int i = 0; i < n; i++) {
			if (List.get(i) > List.get(i + 1)) {
				List.set(i, List.get(i) - 1);
			}
		} 
//		System.out.println(List);
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			if (List.get(i) > List.get(i + 1)) {
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