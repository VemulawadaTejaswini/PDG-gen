import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		calc();
	}

	public static void calc() {
		Scanner sc;
		sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			if(N==0)	break;
			int [][] p = new int[N][N];
			for(int i=0; i<N; i++) {
				int M = sc.nextInt();
				for(int j=0; j<M; j++) {
					p[i][sc.nextInt()-1] = 1;
				}
			}
			
			int K = sc.nextInt();
			int[] L = new int [K];
			for(int i=0; i<K; i++) {
				L[i] = sc.nextInt();
			}
			
			//solve
			int num = 0;
			int index = -1;
			for(int i=0; i<N; i++) {
				int cnt = 0;
				for(int j=0; j<K; j++) {
					if(p[i][L[j]-1] == 1) {
						cnt++;
					}
				}
				if(cnt==K) {
					num++;
					index = i+1;
				}
			}
			System.out.println((num==1)?index:-1);
			
		}
	}
}