import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> A = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			List<Integer> a = new ArrayList<>();
			A.add(a);
		}
		int z = sc.nextInt();
		for (int i = 0; i < z; i++) {
			int q = sc.nextInt();
			if (q == 0) {
				int x = sc.nextInt();
				int t = sc.nextInt();
				List<Integer> a = A.get(x);
				a.add(t);
			}
			if (q == 1) {
				int x = sc.nextInt();
				for(int j=0;j<A.get(x).size();j++) {
					System.out.print(A.get(x).get(j));
				if(j!=A.get(x).size()-1)
				System.out.print(" ");
			}
				System.out.println();
			}
			if (q == 2) {
				int x = sc.nextInt();
				A.get(x).clear();
			}
		}
		sc.close();
	}
}


