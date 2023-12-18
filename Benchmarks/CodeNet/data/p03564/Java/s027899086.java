import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int sum = 1;
		for (int i = 0; i < n; i++) {
			sum = Math.min(sum * 2, sum + k);
		}
		System.out.println(sum);
		sc.close();
	}
}