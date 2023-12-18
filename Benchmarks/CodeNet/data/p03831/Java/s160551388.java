import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 0;
		int y = 0;
		long count = 0;
		for (int i=0;i<n;i++) {
			y = x;
			x = sc.nextInt();
			if (i>0) {
				count += Math.min((x-y)*a, b);
			}
		}
		System.out.println(count);
	}

}
