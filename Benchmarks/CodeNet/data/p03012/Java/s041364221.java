import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];
		int sum =0;
		for (int i=0;i<N;i++) {
			p[i] = sc.nextInt();
			sum +=p[i];
		}
		int front =0;
		int min = Integer.MAX_VALUE;
		for (int i=0;i<N;i++) {
			front +=p[i];
			if (min >Math.abs(sum-2*front)) {
				min = Math.abs(sum-2*front);
			}
		}
		System.out.println(min);
	}
}
