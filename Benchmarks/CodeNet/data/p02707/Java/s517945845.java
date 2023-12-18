
import java.util.Scanner;

public class Main {

	int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N+1];
		for (int i=0;i<N-1;i++) {
			int temp = sc.nextInt();
			a[temp]++;
		}
		for (int i=1;i<=N;i++) {
			System.out.println(a[i]);
		}
	}

}