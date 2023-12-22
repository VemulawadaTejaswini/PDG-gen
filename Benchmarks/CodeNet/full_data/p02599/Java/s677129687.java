import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		int num = 998244353;

		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		for (int j = 0; j < n; j++) {
			array[j] = Integer.parseInt(st1.nextToken());
		}
		long[] seg = new long[4*n];
		build(0, n - 1, 1, array, seg);
		for(int j = 0;j<k;j++){
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			getDistinctCount(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()), array, seg, n);
		}

		out.close();

	}

	static long query(int start, int end, int left, int right, int node, long seg[]) {
		// No overlap
		if (end < left || start > right) {
			return 0;
		}

		// Totally Overlap
		else if (start >= left && end <= right) {
			return seg[node];
		}

		// Parital Overlap
		else {
			int mid = (start + end) / 2;

			// Finding the Answer
			// for the left Child
			long leftChild = query(start, mid, left, right, 2 * node, seg);

			// Finding the Answer
			// for the right Child
			long rightChild = query(mid + 1, end, left, right, 2 * node + 1, seg);

			// Combining the BitMasks
			return (leftChild | rightChild);
		}
	}

	// Function to perform update operation
	// in the Segment seg
	static void update(int left, int right, int index, int Value, int node, int ar[], long seg[]) {
		if (left == right) {
			ar[index] = Value;

			// Forming the BitMask
			seg[node] = (1L << Value);
			return;
		}

		int mid = (left + right) / 2;
		if (index > mid) {

			// Updating the left Child
			update(mid + 1, right, index, Value, 2 * node + 1, ar, seg);
		} else {

			// Updating the right Child
			update(left, mid, index, Value, 2 * node, ar, seg);
		}

		// Updating the BitMask
		seg[node] = (seg[2 * node] | seg[2 * node + 1]);
	}

	// Building the Segment Tree
	static void build(int left, int right, int node, int ar[], long seg[]) {
		if (left == right) {

			// Building the Initial BitMask
			seg[node] = (1L << ar[left]);

			return;
		}

		int mid = (left + right) / 2;

		// Building the left seg tree
		build(left, mid, 2 * node, ar, seg);

		// Building the right seg tree
		build(mid + 1, right, 2 * node + 1, ar, seg);

		// Forming the BitMask
		seg[node] = (seg[2 * node] | seg[2 * node + 1]);
	}

	// Utility Function to answer the queries
	static void getDistinctCount(int l1, int r1, int ar[], long seg[], int n) {

				int l = l1, r = r1;

				long tempMask = query(0, n - 1, l - 1, r - 1, 1, seg);

				int countOfBits = 0;

				// Counting the set bits which denote the
				// distinct elements
				for (int s = 63; s >= 0; s--) {

					if ((tempMask & (1L << s)) > 0) {

						countOfBits++;
					}
				}

				System.out.println(countOfBits);
	}
}

// StringJoiner sj = new StringJoiner(" ");
// sj.add(strings)
// sj.toString() gives string of those stuff w spaces or whatever that sequence
// is
