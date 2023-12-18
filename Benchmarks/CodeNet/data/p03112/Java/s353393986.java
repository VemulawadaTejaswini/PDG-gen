import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int nA = Integer.parseInt(sc.next());
		int nB = Integer.parseInt(sc.next());
		int nQ = Integer.parseInt(sc.next());
		long[]A = new long [nA];//神社
		long[]B = new long [nB];//寺
		long[]Q = new long [nQ];//西から数えた開始地点の距離
		long[][] ABdistance = new long[nA][nB];//各神社と各寺の距離
		long res[]=new long [nQ];

		for(int i=0;i<nA;i++)A[i] = Long.parseLong(sc.next());
		for(int i=0;i<nB;i++)B[i] = Long.parseLong(sc.next());
		for(int i=0;i<nQ;i++)Q[i] = Long.parseLong(sc.next());
		sc.close();
		for(int i=0;i<nA;i++) {
			for(int j=0;j<nB;j++) {
				ABdistance[i][j]=Math.abs(A[i]-B[j]);
				//System.out.println(ABdistance[i][j]);
			}
		}

		for(int l=0;l<nQ;l++) {
			int OptLA = 0, OptRA =nA!=1?nA-1:0;
			int OptLB = 0, OptRB =nA!=1?nA-1:0;
			for(int i=1;i<nA;i++) {
				if(A[i]<=Q[l]&&Q[l]-A[OptLA]>Q[l]-A[i]) {
					OptLA=i;
				}else if(A[i]>=Q[l]&&A[OptRA]-Q[l]>A[i]-Q[l]) {
					OptRA=i;
					break;
				}
				//System.out.println(OptLA+" "+OptRA);
			}
			for(int i=1;i<nB;i++) {
				if(B[i]<=Q[l]&&Q[l]-B[OptLB]>Q[l]-B[i]) {
					OptLB=i;
				}else if(B[i]>=Q[l]&&B[OptRB]-Q[l]>B[i]-Q[l]) {
					OptRB=i;
					break;
				}
				//System.out.println(OptLB+" "+OptRB);
			}

			long LABabs = Math.abs(Q[l]-A[OptLA]);
				 LABabs += ABdistance[OptLA][OptLB]<ABdistance[OptLA][OptRB]?ABdistance[OptLA][OptLB]:ABdistance[OptLA][OptRB];
			long RABabs = Math.abs(Q[l]-A[OptRA]);
			     RABabs += ABdistance[OptRA][OptLB]<ABdistance[OptRA][OptRB]?ABdistance[OptRA][OptLB]:ABdistance[OptRA][OptRB];
			long LBAabs = Math.abs(Q[l]-B[OptLB]);
				 LBAabs += ABdistance[OptLA][OptLB]<ABdistance[OptRA][OptLB]?ABdistance[OptLA][OptLB]:ABdistance[OptRA][OptLB];
			long RBAabs = Math.abs(Q[l]-B[OptRB]);
			     RBAabs += ABdistance[OptLA][OptRB]<ABdistance[OptRA][OptRB]?ABdistance[OptLA][OptRB]:ABdistance[OptRA][OptRB];

			res[l]=Math.min(Math.min(LABabs, RABabs),Math.min(LBAabs,RBAabs));
			//System.out.println(Math.min(Math.min(LABabs, RABabs),Math.min(LBAabs,RBAabs)));
		}
		for(int i=0;i<nQ;i++) {
			System.out.println(res[i]);
		}


	}

}
