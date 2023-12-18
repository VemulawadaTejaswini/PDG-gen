import java.util.*;
public class Main {
	Scanner sc;
	int N;
	int[] H;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		H = new int[N];
		for (int i = 0; i < H.length; i++) H[i] = sc.nextInt();
		
		int max = 0;
		int c = 0;
		for (int i = H.length-1; i > 0; i--) {
			if (H[i-1] >= H[i]) {
				c++;
				if (c > max) max = c;
			} else {
				c = 0;
			}
		}
		System.out.println(max);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}