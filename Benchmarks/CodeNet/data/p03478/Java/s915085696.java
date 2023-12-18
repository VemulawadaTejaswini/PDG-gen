import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = 0;
		for (int i = 0; i < n; i++) {
			String str = String.valueOf(i);
			int total2 = 0;
			for (int k = 0; k < str.length(); k++) {
				total2 += Integer.parseInt(str.substring(k, k+1));
			}
			if (a <= total2 && total2 <= b) {
				total += total2;
			}
		}
		
		System.out.println(total);

		sc.close();
	}
}