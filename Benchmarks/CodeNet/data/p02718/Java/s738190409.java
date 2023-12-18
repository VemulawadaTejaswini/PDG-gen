import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn  =new Scanner(System.in);
		int N = scn.nextInt(), M = scn.nextInt();
		int[] A = new int[N];
		int all = 0;
		for(int i = 0;i < N;i++) {
			A[i]= scn.nextInt();
			all += A[i];
		}
		double border = (double)all / (double)(4*M);
		int num = 0;
		for(int i = 0;i < N;i++) {
			if(A[i] > border) {
				num++;
			}
		}
		System.out.println((num >= M)?"Yes":"No");

	}

}
