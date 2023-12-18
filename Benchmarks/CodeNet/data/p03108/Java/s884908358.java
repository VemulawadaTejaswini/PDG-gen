import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] ab = new int[m][2];
		for(int i=0;i<m;i++) {
			ab[i][0] = in.nextInt()-1;
			ab[i][1] = in.nextInt()-1;
		}
		long[] ans = new long[m];
		List<long[]> uft = new ArrayList<>();
		for(int i=0;i<n;i++) {
			long[] tmp = new long[2];
			tmp[0] = i;
			tmp[1] = 1;
			uft.add(tmp);
		}
		ans[m-1] = ((long)n*(long)(n-1))/2;
		for(int i=m-2;i>=0;i--) {
			long[] tmp1 = find(uft,ab[i+1][0]);
			long[] tmp2 = find(uft,ab[i+1][1]);
			if(tmp1[0]!=tmp2[0]) {
				ans[i] = ans[i+1] - (long)tmp1[1]*tmp2[1];
				union(uft,ab[i+1][0],ab[i+1][1]);
			}else {
				ans[i] = ans[i+1];
			}
			
		}
		for(int i=0;i<m;i++) {
			System.out.println(ans[i]);
		}
		in.close();
	}
	
	public static long[] find(List<long[]> uft,int idx) {
		long[] node = uft.get(idx);
		if(node[0]==idx) return node;
		else {
			int parentIdx = (int)node[0];
			uft.set(idx, uft.get(parentIdx));
			return find(uft,parentIdx);
		}
	}
	
	public static long[] union(List<long[]> uft,int idx1,int idx2) {
		long[] node1 = find(uft,idx1);
		long[] node2 = find(uft,idx2);
		node1[1] = node1[1] + node2[1];
		node2[0] = node1[0];
		uft.set(idx1, node1);
		uft.set(idx2, node2);
		return node1;
	}

}
