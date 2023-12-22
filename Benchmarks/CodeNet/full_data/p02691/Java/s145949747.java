import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int count = 0;
		for(int n=0; n<N; n++) {
			A[n] = in.nextInt();
			for(int m=0; m<n-A[n]; m++) {
				if(n-m == A[n]+A[m]) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		in.close();
	}
}
