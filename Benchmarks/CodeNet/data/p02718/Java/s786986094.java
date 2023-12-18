import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		N =sc.nextInt();
		M =sc.nextInt();
		int a[] = new int[N];
		int count =0;
		int total=0;
		for (int i=0;i<N;i++) {
			a[i] =sc.nextInt();
			total+=a[i];
		}
		for (int i=0;i<N;i++) {
			if (a[i]*4*M>=total) {
				count ++;
			}
		}


		if (count >=M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}