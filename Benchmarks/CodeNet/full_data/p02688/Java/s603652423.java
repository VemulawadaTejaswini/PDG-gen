import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Set<Integer> set = new HashSet<>();
		for(int i=0; i<K; i++) {
			int d = sc.nextInt();

			for(int j=0; j<d; j++) {
				int n = sc.nextInt();
				set.add(n);
			}
		}

		System.out.println(N - set.size());

	}

}
