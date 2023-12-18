import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] masu=new int[M];
		for(int i=0; i<M; i++) {
			masu[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(masu);
		if(M==1) {
			System.out.println(0);
			System.exit(0);
		}
		if(N==1) {
			System.out.println(masu[M-1]-masu[0]);
			System.exit(0);
		}
		else {
			if(N>=M) {	//コマが過剰のとき
				System.out.println(0);
				System.exit(0);
			}
			else {
				int[] sa=new int[M-1];
				for(int i=0; i<M-1; i++) {
					sa[i]=masu[i+1]-masu[i];
				}
				Arrays.sort(sa);
				int max=masu[M-1]-masu[0];
				for(int i=0; i<N-1; i++) {
					max-=sa[M-2-i];
				}
				System.out.println(max);
			}
		}
	}
}