import java.util.Arrays;
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
		Arrays.sort(H);
		
		long sum = 0;
		for(int i= N-1-K ; i>=0 ; i--) {
			sum += H[i];
		}
		System.out.println(sum);
	}
}
