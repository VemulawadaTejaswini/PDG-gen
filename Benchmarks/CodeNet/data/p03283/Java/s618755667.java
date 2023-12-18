import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		int q = 0;
		int[][] lrs = null;
		int[][] pqs = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] strs = br.readLine().split(" ");
			
			n = Integer.parseInt(strs[0]);
			m = Integer.parseInt(strs[1]);
			q = Integer.parseInt(strs[2]);
			
			lrs = new int[m][];
			for (int i = 0; i < m; i++) {
				strs = br.readLine().split(" ");
				lrs[i] = new int[] {
					Integer.parseInt(strs[0]),
					Integer.parseInt(strs[1]),
				};
			}
			
			pqs = new int[q][];
			for (int i = 0; i < q; i++) {
				strs = br.readLine().split(" ");
				pqs[i] = new int[] {
					Integer.parseInt(strs[0]),
					Integer.parseInt(strs[1]),
				};
			}
		} catch (IOException e) {
		}
		
		Arrays.sort(lrs, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		
		for (int i = 0; i < q; i++) {
			int count = 0;
			
			for (int j = 0; j < m; j++) {
				if (pqs[i][0] <= lrs[j][0] && pqs[i][1] >= lrs[j][1]) {
					count++;
				} else if(lrs[j][0] > pqs[i][1]) {
					break;
				}
			}
			
			System.out.println(count);
		}
	}
}
