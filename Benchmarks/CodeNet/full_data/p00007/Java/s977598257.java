import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int debt = 100000;
			for (int i = 0; i < n; i++) {
				debt = (int)(debt * 1.05);
			}
			debt = (debt/1000)*1000;
			System.out.println(debt);
		}
	}
}