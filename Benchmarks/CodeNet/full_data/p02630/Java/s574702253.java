import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int tree[] = new int[4 * n];
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], new ArrayList<>());
				ArrayList<Integer> l = map.get(arr[i]);
				l.add(i);
				map.put(arr[i], l);

			} else {
				ArrayList<Integer> l = map.get(arr[i]);
				l.add(i);
				map.put(arr[i], l);
			}
		}
		int q = sc.nextInt();
		buildTree(arr, tree, 0, n - 1, 1);
		while (q-- > 0) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			ArrayList<Integer> l = map.get(b);
			// for (int j = 0; j < 4 * n; j++) {
			// 	System.out.print(tree[j] + " ");
			// }
			if (l == null) {
				int ja = query(tree, 0, n - 1, 1, 0, n - 1);
				System.out.println(ja);
				continue;
			}
			for (int i = 0; i < l.size(); i++) {
				int a = l.get(i);
				ArrayList<Integer> k = map.get(c);
				if (k == null) {
					map.put(c, new ArrayList<>());
					k = map.get(c);
				}
				k.add(a);
				map.put(c, k);
				//System.out.println(map);
				updateTree(arr, tree, 0, n - 1, 1, a, c);
				// for (int j = 0; j < 4 * n; j++) {
				// 	System.out.print(tree[j] + " ");
				// }
				// System.out.println();
			}
			int ans = query(tree, 0, n - 1, 1, 0, n - 1);
			System.out.println(ans);
			map.remove(b);
			//System.out.println(map);
		}

	}
	public static int query(int tree[], int start, int end, int treeNode, int left, int right) {
		if (start > right || end < left) {
			return Integer.MAX_VALUE;
		}
		if (start >= left && end <= right) {
			return tree[treeNode];
		}

		int mid = (start + end) / 2;
		int ans1 = query(tree, start, mid, 2 * treeNode, left, right);
		int ans2 = query(tree, mid + 1, end, 2 * treeNode + 1, left, right);
		return ans1 + ans2;
	}
	public static void updateTree(int arr[], int tree[], int start, int end, int treeNode, int index, int value) {
		if (start == end) {
			arr[index] = value;
			tree[treeNode] = value;
			return;
		}
		int mid = (start + end) / 2;
		if (index > mid) {
			updateTree(arr, tree, mid + 1, end, 2 * treeNode + 1, index, value);
		} else {
			updateTree(arr, tree, start, mid, 2 * treeNode, index, value);
		}
		tree[treeNode] = tree[2 * treeNode] + tree[2 * treeNode + 1];
	}
	public static void buildTree(int arr[], int tree[], int start, int end, int treeNode) {
		//System.out.println(start+" "+end+" "+treeNode);
		if (start == end) {
			tree[treeNode] = arr[start];
			return;
		}
		int mid = (start + end) / 2;
		buildTree(arr, tree, start, mid, 2 * treeNode);
		buildTree(arr, tree, mid + 1, end, 2 * treeNode + 1);
		tree[treeNode] = tree[2 * treeNode] + tree[2 * treeNode + 1];

	}

}