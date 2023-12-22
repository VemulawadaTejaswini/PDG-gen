import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		int u = x - r;
		int e = x + r;
		int f = y - r;
		int l = y + r;
		if (r <= x && r <= y && e <= W && l <= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

