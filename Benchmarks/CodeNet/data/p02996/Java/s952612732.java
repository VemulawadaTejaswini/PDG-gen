import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		List<int[]> ab = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			ab.add(new int[] {a, b, b-a});
		}
		sc.close();
		
//		ab.sort((x,y) -> Integer.compare(x[2], y[2]));
//		
//		int t = 0;
//		for(int i=0;i<N;i++) {
//			int a = ab.get(i)[0];
//			int b = ab.get(i)[1];
//			t += a;
//			if(t>b) {
//				out.println("No");
//				return;
//			}
//		}
//		
//		out.println("Yes");

		Comparator<int[]> c1 = (x,y) -> Integer.compare(x[1], y[1]);
		Comparator<int[]> c2 = c1.thenComparing((x,y) -> Integer.compare(x[0], y[0]));
		ab.sort(c2);
		
		int t = 0;
		for(int i=0;i<N;i++) {
			int a = ab.get(i)[0];
			int b = ab.get(i)[1];
			t += a;
			if(t>b) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
		
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
