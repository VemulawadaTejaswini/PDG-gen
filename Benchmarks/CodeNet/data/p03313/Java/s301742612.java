
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1 << n;
		long[] a = new long[m];
		for (int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		long[][] max = new long[m][2];
		for (int i=0;i<m;i++) {
			TreeSet<Long> set = new TreeSet<Long>();
			max[i][0]=a[i]*m+i;
			for (int j=0;j<n;j++) {
				if ((i>>j)%2!=0) {
					merge(max,i,i-(1<<j));
				}
			}
		}

		long ans = 0;
		for (int i=1;i<m;i++) {
			ans = Math.max(ans, max[i][0]/m+max[i][1]/m);
			System.out.println(ans);
		}
	}

	static void merge(long[][] max, int a, int b) {
		if (max[b][1] > max[a][0]) {
			max[a][0]=max[b][0];
			max[a][1]=max[b][1];
		} else if (max[b][0] > max[a][0]) {
			max[a][1]=max[a][0];
			max[a][0]=max[b][0];
		} else if (max[b][0] > max[a][1] && max[b][0] < max[a][0]) {
			max[a][1]=max[b][0];
		}
	}

}
