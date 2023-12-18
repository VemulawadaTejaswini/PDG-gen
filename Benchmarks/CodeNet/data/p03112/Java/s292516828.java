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
		long res[]=new long [nQ];

		for(int i=0;i<nA;i++)A[i] = Long.parseLong(sc.next());
		for(int i=0;i<nB;i++)B[i] = Long.parseLong(sc.next());
		for(int i=0;i<nQ;i++)Q[i] = Long.parseLong(sc.next());
		sc.close();
		StringBuilder sb = new StringBuilder();
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
				 LABabs += Math.abs(A[OptLA]-B[OptLB])<Math.abs(A[OptLA]-B[OptRB])?Math.abs(A[OptLA]-B[OptLB]):Math.abs(A[OptLA]-B[OptRB]);
			long RABabs = Math.abs(Q[l]-A[OptRA]);
			     RABabs += Math.abs(A[OptRA]-B[OptLB])<Math.abs(A[OptRA]-B[OptRB])?Math.abs(A[OptRA]-B[OptLB]):Math.abs(A[OptRA]-B[OptRB]);
			long LBAabs = Math.abs(Q[l]-B[OptLB]);
				 LBAabs += Math.abs(A[OptLA]-B[OptLB])<Math.abs(A[OptRA]-B[OptLB])?Math.abs(A[OptLA]-B[OptLB]):Math.abs(A[OptRA]-B[OptLB]);
			long RBAabs = Math.abs(Q[l]-B[OptRB]);
			     RBAabs += Math.abs(A[OptLA]-B[OptRB])<Math.abs(A[OptRA]-B[OptRB])?Math.abs(A[OptLA]-B[OptRB]):Math.abs(A[OptRA]-B[OptRB]);

			     sb.append(Math.min(Math.min(LABabs, RABabs),Math.min(LBAabs,RBAabs))).append("\n");
			//res[l]=Math.min(Math.min(LABabs, RABabs),Math.min(LBAabs,RBAabs));
			//System.out.println(Math.min(Math.min(LABabs, RABabs),Math.min(LBAabs,RBAabs)));
		}
		System.out.println(sb);
		/*
		for(int i=0;i<nQ;i++) {
			System.out.println(res[i]);
		}
*/
	}


}

