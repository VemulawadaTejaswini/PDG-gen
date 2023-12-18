import java.util.Scanner;
public class Main {
	static void swap(int[] a,int idx1 , int idx2) {
		int t = a[idx1];	a[idx1]= a[idx2];	a[idx2] = t;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int[] H = new int[N];
		for(int i= 0; i<N ; i++) {
			H[i] = stdIn.nextInt();
		}
		for(int i=0 ; i<N-1 ; i++) {
			for(int j= N-1 ; j>i ; j--) {
				if(H[j-1]>H[j]) {
					swap(H, j-1 , j);
				}
			}
		}
		long sum = 0;
		for(int i= N-1-K ; i>=0 ; i--) {
			sum += H[i];
		}
		System.out.println(sum);
	}
}
