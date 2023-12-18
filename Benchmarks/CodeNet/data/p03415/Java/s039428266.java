import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String[][] a = new String[3][3];
		for (int i = 0 ; i < 3 ; i++) {
			String s = sc.nextLine();
			a[0][i] = s.substring(0, 1);
			a[1][i] = s.substring(1, 2);
			a[2][i] = s.substring(2, 3);
		}
		System.out.println(a[0][0]+a[1][1]+a[2][2]);
	}
}
