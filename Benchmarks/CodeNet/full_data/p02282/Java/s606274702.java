import java.util.Scanner;

public class Main {
	static int cnt, pos;
	static int[] pre, in, post;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		pre = new int[n];
		in = new int[n];
		post = new int[n];
		for(int i = 0; i < n; i++) {
			pre[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			in[i] = scan.nextInt();
		}
		scan.close();
		cnt = 0;
		pos = 0;
		rec(0, n);
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(post[i]);
			}else {
				System.out.print(post[i] +" ");
			}
		}
	}
	// 二分木の復元
	static void rec(int l, int r) {
		if(l >= r) return;
		int root = pre[pos++];
		int mid = 0;
		while(in[mid] != root) {
			mid++;
		}
		rec(l, mid);
		rec(mid + 1, r);
		post[cnt++] = root;
	}
}
