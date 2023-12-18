import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] froms = new int[m];
		int[] toes = new int[m];
		for (int i = 0; i < m; i++) {
		    froms[i] = sc.nextInt() - 1;
		    toes[i] = sc.nextInt() - 1;
		}
		long[] values = new long[m + 1];
		UnionFindTree uft = new UnionFindTree(n);
		values[m] = uft.value;
		for (int i = m - 1; i >= 0; i--) {
		    uft.unite(froms[i], toes[i]);
		    values[i] = uft.value;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= m; i++) {
		    sb.append(values[i]).append("\n");
		}
	    System.out.print(sb);
   }
   
   static class UnionFindTree {
       int[] parents;
       int[] counts;
       long value;
       public UnionFindTree(int size) {
           parents = new int[size];
           counts = new int[size];
           for (int i = 0; i < size; i++) {
               parents[i] = i;
               counts[i] = 1;
           }
           value = (long)size * (size - 1) / 2;
       }
       
       public int find(int x) {
           if (x == parents[x]) {
               return x;
           } else {
               return parents[x] = find(parents[x]);
           }
       }
       
       public void unite(int x, int y) {
           int xx = find(x);
           int yy = find(y);
           if (xx == yy) {
               return;
           }
           parents[xx] = yy;
           value += (long)counts[xx] * (counts[xx] - 1) / 2;
           value += (long)counts[yy] * (counts[yy] - 1) / 2;
           counts[yy] += counts[xx];
           value -= (long)counts[yy] * (counts[yy] - 1) / 2;
       }
   }
}


