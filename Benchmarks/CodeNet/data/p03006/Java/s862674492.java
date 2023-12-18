import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		for(int i=0;i<n;i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		long ans = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				long p = x[i]-x[j];
				long q = y[i]-y[j];
				int[] tree = new int[n];
				for(int k=0;k<n;k++) {
					tree[k] = k;
				}
				for(int a=0;a<n;a++) {
					for(int b=a+1;b<n;b++) {
						if((x[a]-x[b]==p&&y[a]-y[b]==q)||(x[a]-x[b]==-p&&y[a]-y[b]==-q)) {
							union(tree,a,b);
						}
					}
				}
				Set<Integer> set = new HashSet<>();
				for(int k=0;k<n;k++) {
					set.add(find(tree,k));
				}
				if(set.size()<ans) ans = set.size();
			}
		}
		System.out.println(n==1?1:ans);
		in.close();

	}
	
	//return root node idx O(a(N)) ( O(1)<O(a(N))<O(logN) )
	public static int find(int[] tree,int idx) {
		if(tree[idx]==idx) return idx;
		else return tree[idx] = find(tree,tree[idx]);
	}
	
	//union idx2 tree to idx1 tree O(a(N))
	public static void union(int[] tree,int idx1,int idx2) {
		int root1 = find(tree,idx1);
		int root2 = find(tree,idx2);
		tree[root2] = root1;
	}

}
