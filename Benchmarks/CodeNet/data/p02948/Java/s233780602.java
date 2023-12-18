import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		Work[] W = new Work[N];
		for (int i = 0; i < N; i++) {
			W[i] = new Work(scn.nextInt(), scn.nextInt());
		}
		Arrays.sort(W);

		int num[] = new int[M+1];
		int count = 0;
		long ans = 0;
		for(Work w:W) {
			int d = w.day;
			for(int j = d;j <=M;j++) {
				if(num[j] !=0)continue;
				num[j] = w.value;
				count++;
				break;
			}

			if(count == M)break;
		}
		for(long a:num) {
			ans +=a;
		}
		System.out.println(ans);

	}

}

class Work implements Comparable<Work> {
	int day;
	int value;

	public Work(int day, int value) {
		this.day = day;
		this.value = value;
	}

	@Override
	public int compareTo(Work o) {
		if (this.value > o.value) {
			return -1;
		}
		if (this.value < o.value) {
			return 1;
		}

		if (this.day < o.day) {
			return -1;
		}
		if (this.day > o.day) {
			return 1;
		}
		return 0;
	}

	public String toString() {
		return this.day + ":" + this.value;
	}
}
