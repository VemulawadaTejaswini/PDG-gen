import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] w = new int[n];
		long max = 0;
		long acc = 0;

		for (int i=0; i<n; i++) {
			w[i] = stdIn.nextInt();
			acc += w[i];
			max = Math.max(max,w[i]);
		}

		long left = max;
		long right = acc;

		while (left < right) {
			long p = (left+right)/2;
			int id = 0;
			long sum = 0;
			for (int i=0; i<n; i++) {
				if (sum+w[i] > p) {
					sum = w[i];
					id++;
				}else {
					sum += w[i];
				}
				if (id == k)
					break;
			}
			if (id == k)
				left = p+1;
			else
				right = p;
		}
		System.out.println(left);

		stdIn.close();
	}
}