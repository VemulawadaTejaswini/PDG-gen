import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int H = scan.nextInt();
		int W = scan.nextInt();
		int ans = (N-H+1)*(N-W+1);
		System.out.println(ans);
	}
}