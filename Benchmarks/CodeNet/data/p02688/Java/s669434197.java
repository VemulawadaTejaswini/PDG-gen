import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		boolean[] A = new boolean[N];
		for(int k=0; k<K; k++) {
			int D = in.nextInt();
			for(int d=0; d<D; d++) {
				int a = in.nextInt();
				A[a-1] = true;
			}
		}

		int count = 0;
		for(int n=0; n<N; n++) {
			if(!A[n]) {
				count++;
			}
		}
		System.out.println(count);
		
		in.close();
	}
}
