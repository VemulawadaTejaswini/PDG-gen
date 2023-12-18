//--- pF ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();

		int N = Integer.parseInt(line.split("\\s+")[0]);
		int D = Integer.parseInt(line.split("\\s+")[1]);
		int A = Integer.parseInt(line.split("\\s+")[2]);

		TreeMap<Integer, Integer> map = new TreeMap<>();
		int max_idx = 0;
		for (int i=0; i<N; i++) {
			line = scanner.nextLine();
			int X = Integer.parseInt(line.split("\\s+")[0]);
			int H = Integer.parseInt(line.split("\\s+")[1]);
			map.put(X, H);

			max_idx = Math.max(max_idx, X);
		}

		// int[] stArr = new int[max_idx + 1];
		// Arrays.fill(stArr, 0);
		SegmentTree st = new SegmentTree(1, max_idx);

		long res = 0;
		for (;map.keySet().size() != 0;) {
			int cur = map.firstKey();

			long H = map.get(cur) - st.query(Math.max(1, cur-2*D), cur);
			H = Math.max(H, 0);

			int times = (int)Math.ceil(1.0 * H / A);
			int damage = A * times;

			// System.out.println("cur = " + cur + ", times = " + times);

			// for (Integer t = cur; t != null && t <= cur + D*2;) {
			// 	map.put(t, map.get(t) - damage);
			// 	if (map.get(t) <= 0) map.remove(t);
			//
			// 	t = map.ceilingKey(t);
			// }

			st.update(cur, st.query(cur, cur) + damage);
			map.remove(cur);

			res += times;
		}

		System.out.println(res);

		return;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

class SegmentTree {
	SegmentTreeNode root = null;
    int[] nums;
	int inf = Integer.MAX_VALUE;

	// public SegmentTree(int nums[]) {
	// 	this.nums = nums;
    //     root = buildTree(root, 0, nums.length-1);
    // }
	public SegmentTree(int start, int end) {
		root = new SegmentTreeNode(start, end);
	}

	private SegmentTreeNode buildTree(SegmentTreeNode root, int start, int end){
		if (start > end) {
			return null;
		} else if (start == end) {
            SegmentTreeNode cur = new SegmentTreeNode(start, end);
			// RMQ
            // cur.min = nums[start];
			// RSQ
			cur.sum = nums[start];
            return cur;
        } else {
            SegmentTreeNode cur = new SegmentTreeNode(start, end);
            int mid = start + (end - start) / 2;
            cur.left = buildTree(cur.left, start, mid);
            cur.right = buildTree(cur.right, mid+1, end);
			// RMQ
            // cur.min = Math.min(cur.left.min, cur.right.min);
			// RSQ
			cur.sum = cur.left.sum + cur.right.sum;
            return cur;
        }
    }

	public void update(int i, long val) {
        // if (i<0||i>=nums.length) return;
        if (root!=null) update(root, i, val);
		else return;
    }
    public void update(SegmentTreeNode root, int i, long val) {
		if (root == null) return;
        if (root.start == i && root.end == i) {
			// RMQ
            // root.min = val;
			// RSQ
			root.sum = val;
        } else {
            int mid = root.mid();
			if (root.left == null) root.left = new SegmentTreeNode(root.start, mid);
            if (root.right == null) root.right = new SegmentTreeNode(mid+1, root.end);
            if (i <= mid) update(root.left, i, val);
            else update(root.right, i, val);
			// RMQ
            // root.min = Math.min(root.left.min, root.right.min);
			// RSQ
			root.sum = root.left.sum + root.right.sum;
        }
    }

	public long query(int start, int end) {
        if (root == null) return 0;
        else return query(root, start, end);
    }
	public long query(SegmentTreeNode root, int start, int end) {
		if (root == null) return 0;
        if (start > end) {
			return 0;
        } else if (root.start == start && root.end == end){
			return root.sum;
        } else {
            int mid = root.mid();
            if (end <= mid) {
                return query(root.left, start, end);
            } else if (start >= mid+1) {
                return query(root.right, start, end);
            } else {
				// RMQ
                // return Math.min(query(root.left, start, mid), query(root.right, mid+1, end));
				// RSQ
				return query(root.left, start, mid) + query(root.right, mid+1, end);
            }
        }
    }
}

class SegmentTreeNode {
	int inf = Integer.MAX_VALUE;
    public int start, end, min, max;
	public long sum;
    public SegmentTreeNode left, right;
    public SegmentTreeNode(int start, int end) {
        this.left = null;
        this.right = null;
        this.start = start;
        this.end = end;

        this.min = inf;
		this.max = -inf;
		this.sum = 0;
    }
	public int mid() {return this.start + (this.end - this.start) / 2;}
}
