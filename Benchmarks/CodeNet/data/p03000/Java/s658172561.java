import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int dsum = 0, d = 0, i = 0;
		int s[] = new int[n];
		for (int j = 0; j < s.length; j++)
			s[j] = sc.nextInt();
		while (i <= n) {
			d = dsum + s[i];
			if (d > x)
				break;
			else {
				dsum = d;
				i++;
			}
		}
		System.out.println(i + 1);
	}
}
