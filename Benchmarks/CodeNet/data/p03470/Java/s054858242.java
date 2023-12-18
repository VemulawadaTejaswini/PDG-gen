import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	int d[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		d = new int[N];
		for(int i=0; i<N; i++) d[i] = sc.nextInt();
		Arrays.sort(d);
		int j = uniq(d);
		System.out.println(j);
		sc.close();
	}

	private int uniq(int d[]) {
		int j=1;
		for(int i=1; i<N; i++) {
			if(d[j-1] < d[i]) {
				d[j++] = d[i];
			}
		}
		return j;
	}
}