import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double ans;
		ans = ((double)l/3) * ((double)l/3) * ((double)l/3);
		System.out.println(ans);
	}
}
