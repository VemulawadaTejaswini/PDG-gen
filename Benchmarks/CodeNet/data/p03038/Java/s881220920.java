import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		ArrayList<bc> bc = new ArrayList<bc>();
		for(int i=0; i<m; i++) {
			bc.add(new bc(sc.nextLine()));
		}
		sc.close();

		Collections.sort(bc);

		Arrays.sort(a);

		int current = 0;
		long sum = 0;
		for(int i=0; i<n; i++) {
			if (current < m && a[i] < bc.get(current).c) {
				a[i] = bc.get(current).c;
				bc.get(current).b--;
				if(bc.get(current).b == 0) {
					current++;
				}
			}
			sum += a[i];
		}
		System.out.println(sum);

	}
}
