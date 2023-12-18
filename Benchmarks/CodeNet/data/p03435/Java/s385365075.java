import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = Integer.parseInt(sc.next());
		int a1min = Math.min(Math.min(c[0][0], c[0][1]), Math.min(c[0][1], c[0][2]));
		int a2min = Math.min(Math.min(c[1][0], c[1][1]), Math.min(c[1][1], c[1][2]));
		int a3min = Math.min(Math.min(c[2][0], c[2][1]), Math.min(c[2][1], c[2][2]));
		int b1min = Math.min(Math.min(c[0][0], c[1][0]), Math.min(c[1][0], c[2][0]));
		int b2min = Math.min(Math.min(c[0][1], c[1][1]), Math.min(c[1][1], c[2][1]));
		int b3min = Math.min(Math.min(c[0][2], c[1][2]), Math.min(c[1][2], c[2][2]));
		for (int i = 0 ; i < 3; i++)
			c[0][i] -= a1min;
		for (int i = 0 ; i < 3; i++)
			c[1][i] -= a2min;
		for (int i = 0 ; i < 3; i++)
			c[2][i] -= a3min;
		for (int i = 0 ; i < 3; i++)
			c[i][0] -= b1min;
		for (int i = 0 ; i < 3; i++)
			c[i][1] -= b2min;
		for (int i = 0 ; i < 3; i++)
			c[i][2] -= b3min;
		boolean yes = true;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (c[i][j] != 0)
					yes = false;
		System.out.println((yes)? "Yes" : "No");
	}
}