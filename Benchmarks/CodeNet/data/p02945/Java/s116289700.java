import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int max=n+m;
		max=Math.max(max, n-m);
		max=Math.max(max, n*m);
		System.out.println(max);
	}
}
