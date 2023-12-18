import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		boolean judge = true;
		int first=0;
		int second=0;
		
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		
		for(int i=0;i<N;i++)
			first+=a[i];

		for (int i = 0; i < N; i++) {
			if (a[i] > x)
				a[i] = x;
		}

		while (judge) {
			
			judge=false;
			
			for (int i = 0; i < N - 1; i++) {
				if (a[i] + a[i + 1] > x) {
					a[i + 1]--;
					judge = true;
				}
			}
		}
		
		for(int i=0;i<N;i++)
			second+=a[i];
		
		System.out.println(first-second);
	}

}
