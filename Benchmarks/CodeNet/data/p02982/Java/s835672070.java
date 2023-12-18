import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static public void main(String ...strings ) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int D = sc.nextInt();
		final int p[][] = new int[N][D];
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<127;i++) {
			set.add(i+i);
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				p[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N;j++) {
				int diff = 0;
				for(int d=0;d<D;d++) {
					diff = (p[i][d]-p[j][d])*(p[i][d]-p[j][d]);
				}
				if(set.contains(diff)) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();

	}
}
