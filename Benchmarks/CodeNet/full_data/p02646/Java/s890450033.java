import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		if (w >= v || Math.abs(a - b) / (v - w) > t) {
		    System.out.println("NO");
		} else {
		    System.out.println("YES");
		}
	}
}
