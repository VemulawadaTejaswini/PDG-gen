import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		sc.close();
		
		String result = null;
		while (result == null) {
			C -= B;
			if (C <= 0) {
				result = "Yes";
				break;
			}
			A -= D;
			if (A <= 0) {
				result = "No";
			}
		}
		System.out.println(result);
	}
}