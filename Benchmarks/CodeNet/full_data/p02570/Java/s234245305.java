import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();

		int time = d/s;
		if(time > t) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}