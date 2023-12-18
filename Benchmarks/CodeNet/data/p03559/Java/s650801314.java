import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			C[i] = sc.nextInt();
		}
		long result =0;
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		for (int i=0;i<N;i++) {
			int position = Main.findBig(B, 0, A[i]);
			if (position==-1) {
				System.out.println(result);
				return;
			}
			for (int j=position;j<N;j++) {
				int positionC= Main.findBig(C,0,B[j]);
				if (positionC==-1) {
					System.out.println(result);
					return;
				}
				result +=(N-positionC);
			}
		}
		System.out.println(result);
	}
	public static int findBig(int A[],int start,int target) {
		int end = A.length-1;
		int min = -1;
		while (end>=start) {
			int mid = (start+end)/2;
			if (A[mid]>target) {
				min = mid;
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return min;
	}
}