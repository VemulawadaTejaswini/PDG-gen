
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] town = new int[n];
		for(int i = 0; i < m; i++) {
			town[sc.nextInt() - 1] ++;
			town[sc.nextInt() - 1] ++;
		}
		for(int i : town) {
			System.out.println(i);
		}
	}

}
