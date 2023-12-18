import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		int[] p = new int[Q];
		int[] q = new int[Q];

		for(int i=0;i<M;i++){
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		for(int i=0;i<Q;i++){
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}
		sc.close();

		for(int i=0;i<Q;i++){
			int sum = 0;
			for(int k=0;k<M;k++){
				if(p[i] <= L[k] && q[i] >= R[k] ){
					sum++;
				}
			}
			System.out.println(sum);
		}


	}

}

