import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int n_int = Integer.parseInt(n);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = 0;
		for (int i = 0; i < n_int; i++) {
			String[] n_item = n.split("");
			int total2 = 0;
			for (int k = 0; k < n_item.length; k++) {
				total2 += Integer.parseInt(n_item[k]);
			}
			if (a <= total2 && total2 <= b) {
				total += total2;
			}
		}
		
		System.out.println(total);

		sc.close();
	}
}