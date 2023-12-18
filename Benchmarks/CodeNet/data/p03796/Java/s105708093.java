import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 1;
		for(int i=1;i<=N;i++) {
			sum = (sum*i)%1000000007;
		}

		System.out.println(sum);
		/*if(sum<1000000007) {
			System.out.println(sum);
		}else {
			System.out.println(sum%1000000007);
		}*/




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
