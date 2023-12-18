import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int Q = scan.nextInt();
		int[][] Qlist = new int[Q][4];
		for(int i = 0;i<Q;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();

			Qlist[i][0]= a;
			Qlist[i][1]= b;
			Qlist[i][2]= c;
			Qlist[i][3]= d;
		}
		int[] A = new int[N];
		int Atmp = 1;
		for(int i = 0;i<N;i++) {
			A[i]=Atmp;
		}
		int sum = 0;
		int maxnum = 0;
		for(int i = 0;i<Q;i++) {
			if(A[Qlist[i][1]-1]-A[Qlist[i][0]-1]==Qlist[i][2]) {
				maxnum += Qlist[i][3];
			}
		}
		for(int i = N-1;i>=0;i--) {
			do {
			A[i]++;
			sum=0;
			for(int j = 0;j<Q;j++) {
				if(A[Qlist[j][1]-1]-A[Qlist[j][0]-1]==Qlist[j][2]) {
					sum += Qlist[j][3];
				}
			}
			if(maxnum<sum) {
				maxnum = sum;
			}
			}while(A[i]+1<=M);
		}

		System.out.println(maxnum);

	}
}