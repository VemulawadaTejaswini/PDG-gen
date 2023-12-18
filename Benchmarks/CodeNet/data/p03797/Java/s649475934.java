import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int answer = 0;
		
		if (m >= n * 2) {
			answer = n + (m - n * 2) / 4;
		} else {
			answer = m / 2;
		}
		
		System.out.println(answer);
	}
}