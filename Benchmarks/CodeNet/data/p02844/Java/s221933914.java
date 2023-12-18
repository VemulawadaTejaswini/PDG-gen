import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String luckyNum = sc.next();
		HashSet<String> lockNumSet = new HashSet<>();
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					String newLock = luckyNum.charAt(i) + "" + luckyNum.charAt(j) + "" + luckyNum.charAt(k);
					lockNumSet.add(newLock);
				}
			}
		}
		System.out.println(lockNumSet.size());
	}

}