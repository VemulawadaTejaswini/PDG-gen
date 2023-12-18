import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		Set<Integer> hs =new HashSet<>();
		int N=sc.nextInt();
		int K = sc.nextInt();
		
		for (int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				hs.add(sc.nextInt());
			}
		}
		System.out.println(N - hs.size());
	}
}