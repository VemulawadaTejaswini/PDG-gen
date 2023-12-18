import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Set<Integer> set= new HashSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			set.add(d);
		}
		
		int pay = n;
		while (isDislike(pay)) {
			pay++;
		}
		System.out.println(pay);
	}
	
	static boolean isDislike(int n) {
		while (n > 0) {
			if (set.contains(n % 10)) {
				return true;
			}
			n /= 10;
		}
		return false;
	}
}
