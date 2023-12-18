package atcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class BTNode {
	private Integer label;
	private BTNode left;
	private BTNode right;

	public BTNode() {
		this.label = label;
		this.left = left;
		this.right = right;
	}

	public void create(Integer a) {
		if (this == null) {
			this.label = a;
		}
		if (this.label >= a) {
			right.create(a);
		} else {
			left.create(a);
		}
	}

	public int search() {
		BTNode a;
		int ans = 0;
		for(;;) {
			if (this != null) {
				ans += 1;
				a = this.left;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int ans = 0;
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(sc.nextInt());

		BTNode tree = new BTNode();
		for (Integer input : p) {

			tree.create(input);
		}
		ans = tree.search();
		//System.out.println(tree);
		System.out.println(ans);
	}
}