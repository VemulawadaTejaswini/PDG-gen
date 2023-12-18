import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int Alice = 0;
		int Bob = 0;
		for(int i = 1; i < N+1; i++) {
			if(i % 2 == 1) {
				Alice += a[N-i];
			}else {
				Bob += a[N-i];
			}
		}
		System.out.println(Alice - Bob);
	}

}
