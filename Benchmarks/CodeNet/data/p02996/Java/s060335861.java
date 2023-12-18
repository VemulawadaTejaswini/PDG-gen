import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Work[] W = new Work[N];
		for(int i = 0;i < N;i++) {
			W[i] = new Work(scn.nextLong(), scn.nextLong());
		}
		Arrays.sort(W);
		long now = 0;
		boolean can = true;
		for(int i = 0;i < N && can;i++) {
			now += W[i].A;
			can &= (now <= W[i].B);
		}
		System.out.println(can?"Yes":"No");
	}

}

class Work implements Comparable<Work> {
	long A, B;

	public Work(long A, long B) {
		this.A = A;
		this.B = B;
	}

	@Override
	public int compareTo(Work o) {
		if (this.B < o.B) {
			return -1;
		} else {
			if (this.B == o.B) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}
