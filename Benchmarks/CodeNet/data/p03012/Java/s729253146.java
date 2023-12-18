import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int s1 = 0, s2 = 0, min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			s2 += W[i];
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			s1 += W[i];
			s2 -= W[i];
			int abs = Math.abs(s1 - s2);
			if(abs < min) min = abs;
		}
		System.out.println(min);
	}
}
