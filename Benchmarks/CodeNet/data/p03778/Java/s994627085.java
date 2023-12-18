import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();

		if(a+W<b) {
			System.out.println(b-a-W);
		}else if(a>b+W){
			System.out.println(a-b-W);
		}else {
			System.out.println(0);
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
