import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		long[] A = new long[N];
		long sum1 = 0;
		long sum2 = 0;
		for(int i=0; i<N; i++) {
			A[i] = in.nextLong() - (i+1);
			if(A[i] < 0) {
				sum1 += A[i];
			}else {
				sum2 += A[i];
			}
		}
		long min = sum2 - sum1;

		int j = 1;
		while(true) {
			sum1 = 0;
			sum2 = 0;
			for(int i=0; i<N; i++) {
				if(A[i]+j < 0) {
					sum1 += A[i]+j;
				}else {
					sum2 += A[i]+j;
				}
			}
			if(min >= sum2 -sum1) {
				min = sum2 -sum1;
			}else {
				break;
			}
			j++;
		}
		j=-1;
		while(true) {
			sum1 = 0;
			sum2 = 0;
			for(int i=0; i<N; i++) {
				if(A[i]+j < 0) {
					sum1 += A[i]+j;
				}else {
					sum2 += A[i]+j;
				}
			}
			if(min >= sum2 -sum1) {
				min = sum2 -sum1;
			}else {
				break;
			}
			j--;
		}
		
		System.out.println(min);
		in.close();
		
	}
}