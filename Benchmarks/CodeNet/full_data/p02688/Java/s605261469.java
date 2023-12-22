import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N,K;

		N=sc.nextInt();
		K=sc.nextInt();
		int[] d = new int[K];
		
		int[][] A = new int[K][K];
		
		for(int i=0;i<K;i++) {
			d[i]=sc.nextInt();
			for(int j=0;j<d[i];j++) {
				A[i][j]=sc.nextInt();
			}
		}
		
		int max=0;
			for(int i=0; i<K;i++) {
				if(d[i]>max) max=d[i];
			}
			System.out.println(N-max);
	}
}
