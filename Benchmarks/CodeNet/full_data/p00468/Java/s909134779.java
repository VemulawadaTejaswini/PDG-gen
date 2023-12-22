import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {
	
	static boolean[] ans;
	static Node[] list;
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if(n == 0 && m == 0) break;
			list = new Node[n];
			for (int i = 0; i < n; i++) {
				list[i] = new Node(i);
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				list[a].list.add(list[b]);
				list[b].list.add(list[a]);
			}
			ans = new boolean[n];
			dfs(0, 0);
			int count = 0;
			for (int i = 1; i < n; i++) {
				if (ans[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
	}
	static void dfs(int a, int b) {
		if(b == 0)
			for(int i = 0; i < list[a].list.size(); i++) {
				ans[list[a].list.get(i).id] = true;
				dfs(list[a].list.get(i).id,1);
			}
		if(b == 1)
			for(int i = 0; i < list[a].list.size(); i++) {
				ans[list[a].list.get(i).id] = true;
			}
	}
	
	
	static class Node {
		int id;
		ArrayList<Node> list = new ArrayList<Node>();
		Node(int a) {
			id = a;
		}
	}
}