import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long [] A = new long [N];
		int [][] BC = new int [M][2];
		for (int i = 0; i<N; i++) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		for (int i = 0; i<M; i++) {
			BC[i][0] = sc.nextInt();
			BC[i][1] = sc.nextInt();
		}
		Arrays.sort(BC, new Comparator<int[]>() { //double[]でコンパレーターを実装する
			  public int compare(int[] a,int[] b) {
			    if(a[1] > b[1]) {
			      return 1;
			    }else if (a[1] == b[1]) {
			      return 0;
			    }else {
			      return -1;
			  }}});
		
		int tmp = M-1;
		int t = 0;
		Outer:
		while(BC[0][0] >=1 && t < N) {
			if(A[t] < BC[tmp][1]) {
				A[t] = BC[tmp][1];
				BC[tmp][0]--;
				t++;
				if(BC[tmp][0] == 0) {
					tmp--;
				}
			}
			else {
				break Outer;
			}
		}
		long sum = 0;
		for (int i =0; i< N;i++) {
			sum += A[i];
		}
		System.out.println(sum);
	}
}	

