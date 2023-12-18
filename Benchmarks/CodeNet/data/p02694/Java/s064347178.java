import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int m = 100;
		int y = 0;
		while (m < x) {
			y++;
			m = m + m / 100;
		}
		System.out.println(y);
	}
}