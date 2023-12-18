import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n];

		int c = 0;
		for(int i = 0; i < n; i++) {
			p[i] = in.nextInt();
			if(p[i] != i+1)
				c++;
		}

		String ans = (c <= 2) ? "YES" : "NO";
		System.out.println(ans);
	}
}
