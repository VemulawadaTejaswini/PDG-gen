import java.util.Arrays;
import java.util.Scanner;

class bc  implements Comparable<bc>{
	public long  b;
	public long c;

	public bc(String s) {
		String[] tmp = s.split(" ");
		this.b = Long.parseLong(tmp[0]);
		this.c = Long.parseLong(tmp[1]);
	}
	public int compareTo(bc other) {
		// cで降順ソート
		return this.c < other.c ? 1 : (this.c > other.c ? -1 : 0);
	}

	public String toString() {
		return "b=" + this.b + ", c="+this.c;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		long[] a = new long[n];
		tmp = sc.nextLine().split(" ");
		for(int i=0; i<n; i++) {
			a[i] = Long.parseLong(tmp[i]);
		}
		bc[] bc = new bc[m];
		for(int i=0; i<m; i++) {
			bc[i] = new bc(sc.nextLine());
		}
		sc.close();

		Arrays.sort(a);
		Arrays.sort(bc);

		int current = 0;
		long sum = 0;
		for(int i=0; i<n; i++) {
			if (current < m && a[i] < bc[current].c) {
				a[i] = bc[current].c;
				bc[current].b--;
				if(bc[current].b == 0) {
					current++;
				}
			}
			sum += a[i];
		}
		System.out.println(sum);

	}
}