import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		int t = 0;
		for (int i = 1; y < x; i++) {
			y += i;
			t++;
		}
		System.out.println(t);
	}
}