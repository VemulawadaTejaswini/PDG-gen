import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),M = sc.nextInt();
		char[][] arrayA = new char[N][N];
		char[][] arrayB = new char[M][M];
		int[] flg = new int[N-M+1];
		int sum=0;
		String buff;

		for(int i=0;i<N;i++) {
			buff = sc.next();
			for(int j=0;j<N;j++) {
				arrayA[i][j] = buff.charAt(j);
			}
		}
		for(int i=0;i<M;i++) {
			buff = sc.next();
			for(int j=0;j<M;j++) {
				arrayB[i][j] = buff.charAt(j);
			}
		}
		for(int i=0;i<N-M+1;i++) {
			flg[i] = sample(N,M,arrayA,arrayB,i);
			sum += flg[i];
			//System.out.println(flg[i]);
		}

		if(sum==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
	public static int sample(int N,int M,char[][] arrayA,char[][] arrayB,int k) {
		int res=0;
		for(int i=0;i<N-M+1;i++) {
			for(int j=0;j<M;j++) {
				for(int l=0;l<M;l++) {
					if(arrayA[j+k][l+i]!=arrayB[j][l]) {
						res = 1;
						break;
					}
				}
			}
			if(res == 0) {
				return 0;
			}
			res = 0;
		}
		return 1;
	}

}
