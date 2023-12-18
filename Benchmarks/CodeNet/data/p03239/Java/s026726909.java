import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = sc.nextInt();
		int c[] = new int[n];
		int t[] = new int[n];
		int min = -1;
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
			if (t[i] <= time && (c[i] < min || min == -1))
				min = c[i];
		}
		System.out.println(min==-1 ? "TLE\n" : min);
	}
}