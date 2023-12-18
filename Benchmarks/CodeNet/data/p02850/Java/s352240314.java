import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int a[] = new int[N-1];
		int count =0;
		int before =0;
		Main main = new Main();
		Node[] node = new Node[N-1];
		for (int i=0;i<N-1;i++) {
			Node temp = main.new Node();
			temp.start  = sc.nextInt();
			temp.end = sc.nextInt();
			temp.num = i;
			node[i] = temp;
		}
		Arrays.sort(node);
		for (int i=0;i<N-1;i++) {
			if (node[i].start != before) {
				count = 1;
				before = node[i].start;
			} else {
				count++;
			}
			if (map.get(node[i].start)!=null&&map.get(node[i].start)==count) {
				count++;
			}
			map.put(node[i].end, count);
			if (count>max ) {
				max = count;
			}
			a[node[i].num]= count;
		}
		System.out.println(max);
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public class Node implements Comparable<Node>{
		int start;
		int end;
		int num;
		@Override
		public int compareTo(Node o) {
			if (this.start!=o.start) {
				return this.start-o.start;
			}
			return this.end-o.end;
		}

	}
}