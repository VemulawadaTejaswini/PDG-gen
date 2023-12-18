import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long countA= 0;
		long countB=0;
		long a[] = new long[N];
		long b[] = new long[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextLong();
			countA+=a[i];
		}
		for (int i=0;i<N;i++) {
			b[i] = sc.nextLong();
			countB+=b[i];
		}
		if (countB>=countA) {
			long count = countB-countA;
			for (int i=0;i<N;i++) {
				if (a[i]>b[i]) {
					if ((a[i]-b[i])/2+(a[i]-b[i])%2>count) {
						System.out.println("No");
						return ;
					}
				} else if (b[i]>a[i]) {
					if (b[i]-a[i]>count) {
						System.out.println("No");
						return ;
					}
				}
			}
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
