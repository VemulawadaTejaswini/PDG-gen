import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] L = new int[N];
		int[] R = new int[N];
		int a, al, ar;
		for(int i = 0; i < N; i++) {
			a = scanner.nextInt();
			al = i + a; if(al < N) L[i + a]++;
			ar = i - a; if(ar > -1) R[i - a]++;
		}
		int count = 0;
		for(int i = 0; i < N; i++) {
			count += L[i] * R[i];
		}
		System.out.println(count);
	}
}
