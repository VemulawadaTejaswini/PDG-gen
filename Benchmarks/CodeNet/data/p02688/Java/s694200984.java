
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 1; i <= K;i++) {
			int d = sc.nextInt();
			for(int j = 1; j <= d;j++) {
				int tmp = sc.nextInt();
				hs.add(tmp);
			}
		}
		System.out.println(N - hs.size());
	}

}
