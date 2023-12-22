import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int count =0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for (int i=0;i<N;i++) {
			boolean  b = false;
			for (int j=0;j<i;j++) {
				if (A[i]%A[j]==0) {
					b = true;
					break;
				}
			}
			if (i+1<N) {
				if (A[i]==A[i+1]) {
					i++;
					continue;
				}
			}
			if (b==false) {
				count ++;
				continue;
			}
		}
		System.out.println(count);
	}
}