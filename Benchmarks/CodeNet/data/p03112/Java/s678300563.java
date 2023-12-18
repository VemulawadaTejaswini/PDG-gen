
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		//long[]Q = new long [nQ];//西から数えた開始地点の距離

		for(int i=0;i<nA;i++)A[i] = Long.parseLong(sc.next());
		for(int i=0;i<nB;i++)B[i] = Long.parseLong(sc.next());
		//for(int i=0;i<nQ;i++)Q[i] = Long.parseLong(sc.next());
		StringBuilder sb = new StringBuilder();
		for(int l=0;l<nQ;l++) {
			List<Long> listA = LongList(A);
			List<Long> listB = LongList(B);
			int OptLA = 0, OptRA = nA-1;//OptRA =nA!=1?nA-1:0;
			int OptLB = 0, OptRB = nB-1;//OptRB =nB!=1?nB-1:0;
			long X = Long.parseLong(sc.next());
			int Alower_bound = 0;
			int Blower_bound = 0;
			if(nA>1)Alower_bound = ~Collections.binarySearch(listA, X, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
			if(nB>1)Blower_bound = ~Collections.binarySearch(listB, X, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
	        if(Alower_bound>=nA)Alower_bound-=1;
	        if(Blower_bound>=nB)Blower_bound-=1;

			//System.out.println(" "+Alower_bound);
	        //System.out.println(" "+Blower_bound);

			for(int i=Math.max(1,Alower_bound-1);i<=Alower_bound;i++) {
				if(A[i]<=X&&X-A[OptLA]>X-A[i]) {
					OptLA=i;
				}
				if(A[i]>=X&&A[OptRA]-X>A[i]-X) {
					OptRA=i;
					break;
				}
				//System.out.println(OptLA+" "+OptRA);
			}
			for(int i=Math.max(1,Blower_bound-1);i<=Blower_bound;i++) {
				if(B[i]<=X&&X-B[OptLB]>X-B[i]) {
					OptLB=i;
				}
				if(B[i]>=X&&B[OptRB]-X>B[i]-X) {
					OptRB=i;
					break;
				}
				//System.out.println(OptLB+" "+OptRB);
			}

			long LABabs = Math.abs(X-A[OptLA]);
				 LABabs += Math.abs(A[OptLA]-B[OptLB])<Math.abs(A[OptLA]-B[OptRB])?Math.abs(A[OptLA]-B[OptLB]):Math.abs(A[OptLA]-B[OptRB]);
			long RABabs = Math.abs(X-A[OptRA]);
			     RABabs += Math.abs(A[OptRA]-B[OptLB])<Math.abs(A[OptRA]-B[OptRB])?Math.abs(A[OptRA]-B[OptLB]):Math.abs(A[OptRA]-B[OptRB]);
			long LBAabs = Math.abs(X-B[OptLB]);
				 LBAabs += Math.abs(A[OptLA]-B[OptLB])<Math.abs(A[OptRA]-B[OptLB])?Math.abs(A[OptLA]-B[OptLB]):Math.abs(A[OptRA]-B[OptLB]);
			long RBAabs = Math.abs(X-B[OptRB]);
			     RBAabs += Math.abs(A[OptLA]-B[OptRB])<Math.abs(A[OptRA]-B[OptRB])?Math.abs(A[OptLA]-B[OptRB]):Math.abs(A[OptRA]-B[OptRB]);

			     sb.append(Math.min(Math.min(LABabs, RABabs),Math.min(LBAabs,RBAabs))).append("\n");
			}
		System.out.println(sb);
		sc.close();

	}

	private List<Long> LongList(long[] aa) {
		List<Long> list = new ArrayList<>();
        for (long i : aa) {
            list.add(i);
        }
        Collections.sort(list);
        return list;
	}

}
