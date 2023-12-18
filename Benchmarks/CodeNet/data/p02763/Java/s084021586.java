//--- pE ---//
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
		int N = Integer.parseInt(scanner.nextLine());
		String str = scanner.nextLine();

		List<BinaryIndexedTree> list_st = new ArrayList<>();
		// int[] tarr = new int[N];
		// int N = 5e6;
		// for (int i=0; i<26; i++) {
		// 	list_st.add(new BinaryIndexedTree());
		// 	list_st.get(i).constructBITree(N);
		// }
		long[][] bit = new long[26][N+5];

		for (int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			// list_st.get(idx).updateBIT(N, i, 1);
			addBIT(bit[idx], i, 1);
		}

		int Q = Integer.parseInt(scanner.nextLine());
		StringBuilder str_sb = new StringBuilder(str);
		for (;Q-->0;) {
			String[] vals = scanner.nextLine().split("\\s+");
			int q = Integer.parseInt(vals[0]);

			if (q == 1) {
				int i = Integer.parseInt(vals[1]);
				char c = vals[2].charAt(0);
				int n = str_sb.charAt(i-1) - 'a';
				int m = c - 'a';

				addBIT(bit[n], i-1, -1);
				// list_st.get(n).updateBIT(N, i-1, -1);

				str_sb.setCharAt(i-1, c);

				addBIT(bit[m], i-1, 1);
				// list_st.get(m).updateBIT(N, i-1, 1);
			} else {
				int l = Integer.parseInt(vals[1])-1;
				int r = Integer.parseInt(vals[2])-1;
				int cnt = 0;
				for (int i=0; i<26; i++) {
					long t = sumBIT(bit[i], r) - sumBIT(bit[i], l-1);
					// System.out.println("sum = " + t);
					if (t > 0) cnt ++;
				}
				System.out.println(cnt);
			}
		}
		return;
	}

	public static long sumBIT(long[] arr, int i) {
		long sum = 0;
		for(i++;i > 0;i -= i&-i)sum += arr[i];
		return sum;
	}


	public static void addBIT(long[] arr, int i, long v) {
		if(v == 0)return;
		int n = arr.length;
		for(i++;i < n;i += i&-i)arr[i] += v;
	}

	// int main() {
    // int N;
    // string S;
    // int Q;
    // cin >> N >> S >> Q;
    // for(int i = 0; i < N; ++i) {
    //     int n = S[i] - 'a';
    //     bit[n].add(i + 1, 1);
    // }
    // while(Q--) {
    //     int q; cin >> q;
    //     if(q == 1) {
    //         int i;
    //         char c;
    //         cin >> i >> c;
    //         int n = S[i-1] - 'a';
    //         int m = c - 'a';
    //         bit[n].add(i, -1);
    //         S[i-1] = c;
    //         bit[m].add(i, 1);
    //     } else {
    //         int l, r;
    //         cin >> l >> r;
    //         int cnt = 0;
    //         for(int i = 0; i < 26; ++i) {
    //             if(bit[i].sum(l, r)) cnt++;
    //         }
    //         cout << cnt << '\n';
    //     }
    // }


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

class BinaryIndexedTree {
    // Max tree size
    int N;

 	int BITree[];

    /* n --> No. of elements present in input array.
    BITree[0..n] --> Array that represents Binary
                    Indexed Tree.
    arr[0..n-1] --> Input array for which prefix sum
                    is evaluated. */

    // Returns sum of arr[0..index]. This function
    // assumes that the array is preprocessed and
    // partial sums of array elements are stored
    // in BITree[].
    int getSum(int index)
    {
        int sum = 0; // Iniialize result

        // index in BITree[] is 1 more than
        // the index in arr[]
        index = index + 1;

        // Traverse ancestors of BITree[index]
        while(index>0)
        {
            // Add current element of BITree
            // to sum
            sum += BITree[index];

            // Move index to parent node in
            // getSum View
            index -= index & (-index);
        }
        return sum;
    }

    // Updates a node in Binary Index Tree (BITree)
    // at given index in BITree. The given value
    // 'val' is added to BITree[i] and all of
    // its ancestors in tree.
    public void updateBIT(int n, int index,
                                        int val)
    {
        // index in BITree[] is 1 more than
        // the index in arr[]
        index = index + 1;

        // Traverse all ancestors and add 'val'
        while(index <= n)
        {
        // Add 'val' to current node of BIT Tree
        BITree[index] += val;

        // Update index to that of parent
        // in update View
        index += index & (-index);
        }
    }

    /* Function to construct fenwick tree
    from given array.*/
    void constructBITree(int n){
		BITree = new int[n+5];
        // Initialize BITree[] as 0
        // for(int i=1; i<=n; i++)
        //     BITree[i] = 0;

        // Store the actual values in BITree[]
        // using update()
        // for(int i = 0; i < n; i++)
        //     updateBIT(n, i, arr[i]);
    }
}
