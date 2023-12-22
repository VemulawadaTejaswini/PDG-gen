import java.io.*;
import java.util.StringTokenizer;

public class Main {

	int maxN = 300001;
	int currentMaxLength;

	void updateRange(int node, int start, int end, int index, int val, int[] tree) {

		if (start > end || start > index || end < index) {
			return;
		}

		// tree[node] = Math.max(tree[node], val);
		
		if (start == end) {
			tree[node] = Math.max(tree[node], val);
			return;
		}

		int mid = (start + end) / 2;
		
		updateRange(node * 2, start, mid, index, val, tree);
		updateRange(node * 2 + 1, mid + 1, end, index, val, tree);
		
		tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
	}

	void updateRange(int node, int start, int end, int l, int r, int val, int[] lazy, int[] tree) {

		if (lazy[node] != 0) {
			tree[node] = Math.max(tree[node], lazy[node]);

			if (start != end) {
				lazy[node * 2] = Math.max(lazy[node], lazy[node * 2]);
				lazy[node * 2 + 1] = Math.max(lazy[node], lazy[node * 2] + 1);
			}

			lazy[node] = 0;
		}

		if (start > end || start > r || end < l) {
			return;
		}

		if (start >= l && end <= r) {

			tree[node] = Math.max(tree[node], val);
			if (start != end) {
				lazy[node * 2] = Math.max(lazy[node * 2], val);
				lazy[node * 2 + 1] = Math.max(lazy[node * 2 + 1], val);
			}

			return;
		}

		int mid = (start + end) / 2;
		updateRange(node * 2, start, mid, l, r, val, lazy, tree);
		updateRange(node * 2 + 1, mid + 1, end, l, r, val, lazy, tree);
		tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
	}

	void queryRange(int node, int start, int end, int l, int r, int[] tree) {

		if (start > end || start > r || end < l) {
			return;
		}

		if (start >= l && end <= r) {

			currentMaxLength = Math.max(currentMaxLength, tree[node]);

		} else {

			int mid = (start + end) / 2;
			queryRange(node * 2, start, mid, l, r, tree);
			queryRange(node * 2 + 1, mid + 1, end, l, r, tree);
		}
	}

	int queryRange(int node, int start, int end, int l, int r, int[] lazy, int[] tree) {

		if (start > end || start > r || end < l) {
			return 0;
		}

		if (lazy[node] != 0) {
			tree[node] = Math.max(tree[node], lazy[node]);

			if (start != end) {
				lazy[node * 2] = Math.max(lazy[node], lazy[node * 2]);
				lazy[node * 2 + 1] = Math.max(lazy[node], lazy[node * 2] + 1);
			}

			lazy[node] = 0;
		}

		if (start >= l && end <= r) {

			currentMaxLength = Math.max(currentMaxLength, tree[node]);

		} else {

			int mid = (start + end) / 2;
			int p1 = queryRange(node * 2, start, mid, l, r, lazy, tree);
			int p2 = queryRange(node * 2 + 1, mid + 1, end, l, r, lazy, tree);

			tree[node] = Math.max(p1, p2);

		}

		return tree[node];
	}

	public void execute(int input) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (input == 1) {
			br = new BufferedReader(new FileReader("test.txt"));
		}

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] tree = new int[4 * maxN + 100];
		// int[] lazy = new int[4 * maxN + 100];

		int ans = 1;

		for (int i = 0; i < n; i++) {

			int start = Math.max(1, a[i] - k);
			int end = Math.min(maxN, a[i] + k);

			currentMaxLength = 0;
			queryRange(1, 1, maxN, start, end, tree);
			// System.out.println(a[i] + " " + currentMaxLength + " " + start + " " + end);

			ans = Math.max(ans, currentMaxLength + 1);
			updateRange(1, 1, maxN, a[i], currentMaxLength + 1, tree);
		}

		System.out.println(ans);
	}

	public static void main(String[] args) throws Exception {

		Main a = new Main();

		a.execute(1);

	}
}
