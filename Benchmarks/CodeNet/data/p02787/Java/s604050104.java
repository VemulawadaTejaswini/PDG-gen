import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		long mana[] = new long[H];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		long min = Long.MAX_VALUE;
		for (int i=0;i<N;i++) {
			if (A[i]>=H) {
				if (B[i]<min) {
					min = B[i];
				}
			} else {
				if (mana[(int)A[i]]==0||mana[(int)A[i]]>B[i]) {
					mana[(int)A[i]]=B[i];
				}
			}
		}
		for (int i=1;i<H;i++) {
			if (mana[i]==0)
				continue;
			for (int j=0;j<N;j++) {
				if (A[j]+i>=H) {
					if (B[j]+mana[i]<min) {
						min = B[j]+mana[i];
					}
				} else {
					if (mana[(int)A[j]+i]==0||mana[(int)A[j]+i]>B[j]+mana[i]) {
						mana[(int)A[j]+i]=B[j]+mana[i];
					}
				}
			}
		}
		System.out.println(min);
	}
}