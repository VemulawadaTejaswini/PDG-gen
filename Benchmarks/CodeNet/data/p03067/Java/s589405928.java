import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String answer = (A-C)*(B-C) <= 0 ? "Yes": "No";
		System.out.println(answer);
	}
}
