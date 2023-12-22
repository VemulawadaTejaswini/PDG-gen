import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int q;
	
	static int[] a;
	static int[] b;
	static int[] c;
	static int[] d;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();
		
		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new int[q];
		
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
			
			a[i]--;
			b[i]--;
		}
		
		Queue<List<Integer>> que = new ArrayDeque<>();
		for (int i = 1; i <= m; i++) {
			List<Integer> list = new ArrayList<>();
			list.add(i);
			que.add(list);
		}
		
		int max = 0;
		
		while (!que.isEmpty()) {
			List<Integer> list = que.poll();
			
			int size = list.size();
			if (size == n) {
				max = Math.max(max, calcPoint(list));
				continue;
			}
			
			int lastNum = list.get(size - 1);
			for (int i = lastNum; i <= m; i++) {
				List<Integer> nList = new ArrayList<>();
				for (int j = 0; j < size; j++) {
					nList.add(list.get(j));
				}
				nList.add(i);
				que.add(nList);
			}
		}
		
		System.out.println(max);
	}
	
	static int calcPoint(List<Integer> list) {
		int sumD = 0;
		for (int i = 0; i < q; i++) {
			if (list.get(b[i]) - list.get(a[i]) == c[i]) {
				sumD += d[i];
			}
		}
		
		return sumD;
	}
}
