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
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		int right = (int)1e9+5;
		int N = reader.ni(), D = reader.ni(), A = reader.ni();
		TreeMap<Integer, Integer> map_idx = new TreeMap<>();
		for (int i=0; i<N; i++) {
			int x = reader.ni(), h = reader.ni();
			map_idx.put(x, h);
		}

		long res = 0;

		SegmentTreeRSQ st = new SegmentTreeRSQ(0, right);
		while (!map_idx.keySet().isEmpty()) {
			int cur_idx = map_idx.firstKey();
			int cur_health = map_idx.get(cur_idx);

			long done_damage = st.query(0, cur_idx);
			long left_health = cur_health - done_damage;
			if (left_health > 0) {
				int times = (int)Math.ceil(1.0 * left_health / A);
				res += times;
				long do_dmg = A * times;
				int s = cur_idx, e = cur_idx + 2 * D + 1;
				long t1 = st.query(s, s);
				st.update(s, t1 + do_dmg);
				long t2 = st.query(e, e);
				st.update(e, t2 - do_dmg);
			}

			map_idx.remove(cur_idx);
		}

		System.out.println(res);
		return;
	}


}

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public String ns() {return this.next();}
}

class SegmentTreeRSQ {
	SegmentTreeRSQNode root = null;
    int[] nums;
	int inf = Integer.MAX_VALUE;

	public SegmentTreeRSQ(int start, int end) {
		root = new SegmentTreeRSQNode(start, end);
	}

	public void update(int i, long val) {
		if (root == null || i < root.start || i > root.end) return;
        update(root, i, val);
    }
    public void update(SegmentTreeRSQNode root, int i, long val) {
		if (root == null) return;
        if (root.start == i && root.end == i) root.sum = val;
        else {
            int mid = root.mid();
			// split
			// if (root.left == null) root.left = new SegmentTreeRSQNode(root.start, mid);
            // if (root.right == null) root.right = new SegmentTreeRSQNode(mid+1, root.end);
			// visit
            if (i <= mid) {
				if (root.left == null) root.left = new SegmentTreeRSQNode(root.start, mid);
				update(root.left, i, val);
            } else {
				if (root.right == null) root.right = new SegmentTreeRSQNode(mid+1, root.end);
				update(root.right, i, val);
			}
			// merge
			long sum_l = root.left != null ? root.left.sum : 0;
			long sum_r = root.right != null ? root.right.sum : 0;
			root.sum = sum_l + sum_r;
        }
    }

	public long query(int start, int end) {
        if (root == null) return 0;
        else return query(root, start, end);
    }
	public long query(SegmentTreeRSQNode root, int start, int end) {
		if (root == null) return 0;
        if (start > end) {
			return 0;
        } else if (root.start == start && root.end == end){
			return root.sum;
        } else {
            int mid = root.mid();
            if (end <= mid) { // in left
                return query(root.left, start, end);
            } else if (start >= mid+1) { // in right
                return query(root.right, start, end);
            } else {
				return query(root.left, start, mid) + query(root.right, mid+1, end);
            }
        }
    }
}

class SegmentTreeRSQNode {
	int inf = Integer.MAX_VALUE;
    public int start, end, min, max;
	public long sum;
    public SegmentTreeRSQNode left, right;
    public SegmentTreeRSQNode(int start, int end) {
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
