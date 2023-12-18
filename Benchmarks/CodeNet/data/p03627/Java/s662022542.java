import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(A);
		int l1 = 0;
		int l2 = 0;
		for(int i=n-1; i>=1; i--) {
			if(A[i]==A[i-1]) {
				if(l1==0) {
					l1 = A[i];
					i--;
				} else {
					l2 = A[i];
					break;
				}
			}
		}
		System.out.println(l1*l2);
	}
}