import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] H = new int[N];
		for(int i = 0; i<N;i++) {
			H[i] = scan.nextInt();
		}
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i = 0; i<M;i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
		}
		scan.close();
		int good = 0;
		int goodnum = 0;
		int flagnum = -1;
		int flag = -1;

		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				flagnum = -1;
				if(A[j]-1==i) {
					flagnum = B[j];
				}else if(B[j]-1==i) {
					flagnum = A[j];
				}
				if(flagnum!=-1) {
					if(H[i]>H[flagnum-1]) {
						good++;
					}else if(H[i]<H[flagnum-1]){
						good = -2147483648;
					}
					flag = flagnum;
				}
				if(good<0) {
					break;
				}
			}
			if(flag==-1) {
				good++;
			}
			flag = -1;
			if(good>0) {
				goodnum++;
			}
			good = 0;
		}

		System.out.println(goodnum);

	}
}