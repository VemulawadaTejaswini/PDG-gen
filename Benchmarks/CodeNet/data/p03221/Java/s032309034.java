import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<ArrayList<Integer>> py = new ArrayList<ArrayList<Integer>>();
		int p[]=new int[n+1];
		int y[]=new int[n+1];
		for(int i=0; i<=n; i++) {
			py.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();
			py.get(p[i]).add(y[i]);
		}
		for(int i=0; i<=n; i++) {
			Collections.sort(py.get(i));
		}
		for(int i=0; i<m; i++) {
			System.out.printf("%06d%06d\n", p[i], Collections.binarySearch(py.get(p[i]), y[i])+1);
		}
		sc.close();
	}
}
