import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			for(int i = 0; i < n; i++) {
				a *= 10;
				sum += (int)(a / b) % 10;
			}
			System.out.println(sum);
		}
	}
}