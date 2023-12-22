import java.util.ArrayList;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) break;
			BitSet[] info = new BitSet[n];
			for(int i=0; i<n; i++){
				int m = in.nextInt();
				info[i] = new BitSet(n);
				for(int j=0; j<m; j++){
					info[i].set(in.nextInt()-1);
				}
				info[i].flip(0, n);
			}
			BitSet flow = new BitSet(n);
			int k=in.nextInt();
			for(int i=0; i<k; i++){
				flow.set(in.nextInt()-1);
			}
			int mem = -1;
			BitSet tmp = new BitSet(n);
			for(int i=0; i<n; i++){
				tmp.clear(0, n);
				tmp.or(flow);
				tmp.and(info[i]);
				if(tmp.cardinality()==0){
					if(mem == -1) mem = i+1;
					else{
						mem = -1;
						break;
					}
				}
			}
			System.out.println(mem);
		}
	}
}