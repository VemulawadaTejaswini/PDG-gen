import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		for(int i = 1; i < N+1; i++) {
			a[i] = sc.nextInt();
		}

		int nextPosition = a[1];
		int count = 0;
		while(true) {
			count++;
			if(count == N || nextPosition == 2) {
				break;
			}
			nextPosition = a[nextPosition];
		}
		if(count == N) {
			System.out.println("-1");
		} else {
			System.out.println(count);
		}
	}
}