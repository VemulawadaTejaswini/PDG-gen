import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		BinaryIndexedTree bit = new BinaryIndexedTree(n + 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int type = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if (type == 0) {
		        bit.add(x, y);
		    } else {
		        sb.append(bit.getSum(x, y)).append("\n");
		    }
		}
		System.out.print(sb);
	}
}

class BinaryIndexedTree {
    int size;
    int[] tree;
    
    public BinaryIndexedTree(int size) {
        this.size = size;
        tree = new int[size];
    }
    
    public void add(int idx, int value) {
        int mask = 1;
        while (idx < size) {
            if ((idx & mask) != 0) {
                tree[idx] += value;
                idx += mask;
            }
            mask <<= 1;
        }
    }
    
    public int getSum(int from, int to) {
        return getSum(to) - getSum(from - 1);
    }
    
    public int getSum(int x) {
        int mask = 1;
        int ans = 0;
        while (x > 0) {
            if ((x & mask) != 0) {
                ans += tree[x];
                x -= mask;
            }
            mask <<= 1;
        }
        return ans;
    }
}
