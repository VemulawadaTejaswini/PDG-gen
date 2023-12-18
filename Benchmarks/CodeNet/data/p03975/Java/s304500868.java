import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int N = in.nextInt();
			int A = in.nextInt();
			int B = in.nextInt();
			int[] t = new int[N];
			for (int i = 0; i < t.length; i++) {
				t[i] = in.nextInt();
				if (A<=t[i]&&t[i]<B) {
					N--;
				}
			}
			System.out.println(N);
		}
		
		
	}
}