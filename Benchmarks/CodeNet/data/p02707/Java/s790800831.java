
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] res = new int[N+1];
		for (int i = 0; i < N-1; i++) {
			int tmp = sc.nextInt();
			res[tmp]++;
		}
		for (int i = 1; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}