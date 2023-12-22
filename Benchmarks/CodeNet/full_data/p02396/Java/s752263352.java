import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "Case ";
		String delimeter = ": ";

		for (int i = 1; sc.hasNextInt(); i++) {
			int testCase = sc.nextInt(); 
			if (testCase == 0) {
				break;
			} 
			System.out.println(str + i + delimeter + testCase);
		}
	}
}