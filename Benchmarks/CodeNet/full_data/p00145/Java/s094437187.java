import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static class Integer {
		int i;
		
		Integer(int i) {
			this.i = i;
		}
	}
	
	static class DiffArray implements Comparable<DiffArray>{
		int diff;
		int leftIndex;
		
		DiffArray(int diff, int leftIndex) {
			this.diff = diff;
			this.leftIndex = leftIndex;
		}

		public int compareTo(DiffArray o) {
			return o.diff - this.diff;
		}
	}
	
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Integer u[], l[];
		DiffArray dif[];
		long sum;
		
		n = sc.nextInt();
		u = new Integer[n];
		l = new Integer[n];
		dif = new DiffArray[n - 1];
		for (int i = 0; i < n; i++) {
			u[i] = new Integer(sc.nextInt());
			l[i] = new Integer(sc.nextInt());
			if (i != 0) {
				dif[i - 1] = new DiffArray(l[i - 1].i * u[i].i, i - 1);
			}
		}
		Arrays.sort(dif);
		sum = 0L;
		for (int i = 0; i < n - 1; i++) {
			sum += u[dif[i].leftIndex].i * l[dif[i].leftIndex].i * u[dif[i].leftIndex + 1].i * l[dif[i].leftIndex + 1].i;
			l[dif[i].leftIndex].i = l[dif[i].leftIndex + 1].i;
			u[dif[i].leftIndex + 1].i = u[dif[i].leftIndex].i;
		}
		System.out.println(sum);
	}
}