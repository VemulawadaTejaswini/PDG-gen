import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> x = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = 0; j < b; j++)
				x.add(a);
		}
		Collections.sort(x);
		System.out.println(x.get(K-1));
	}

}
