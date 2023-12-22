import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result = "No";
	
		if (a < b && b < c) {
			result = "Yes";
		}

		System.out.println(result);
	}
}