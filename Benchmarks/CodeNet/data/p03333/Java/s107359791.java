import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}

	static class Node implements Comparable<Node>{
		int l;
		int r;
		Node(int ll, int rr){
			l=ll;
			r=rr;
		}
		@Override
		public int compareTo(Node other) {
			if(l<other.l) return -1;
			if(l>other.l) return 1;
			return 0;
		}
	}

	static class Node2  implements Comparable<Node2>{
		int l;
		int r;
		Node2(int ll, int rr){
			l=ll;
			r=rr;
		}
		@Override
		public int compareTo(Node2 other) {
			if(r<other.r) return -1;
			if(r>other.r) return 1;
			return 0;
		}
	}

	void test(Scanner sc){
		N = sc.nextInt();
		Node[] data = new Node[N];
		Node2[] data2 = new Node2[N];
		for (int i = 0; i < N; i++) {
			data[i] = new Node(sc.nextInt(), sc.nextInt());
			data2[i]=new Node2(data[i].l, data[i].r);
		}
		Arrays.sort(data);
		Arrays.sort(data2);
		int n = N;
		int out=0;
		int leftindx = 0;
		int rightindx = data2.length-1;
		int current =0;
		while(n-->0){
			int ld = current - data[leftindx].r;
			int rd = data[rightindx].l -current;
			if(ld>=rd){

				current = data[leftindx].r;
				out+=ld;
				leftindx++;
			}else{

				current = data[rightindx].l;
				out+=rd;
				rightindx--;
			}
		}

		out+=Math.abs(current);

		System.out.println(out);

	}
}
