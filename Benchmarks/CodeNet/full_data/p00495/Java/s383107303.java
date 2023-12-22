import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Card Game is Fun
public class Main{

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		List<Integer>[] l = new List[1001];
		for(int i=0;i<1001;i++)l[i]=new LinkedList<Integer>();
		int[] a = new int[A], b = new int[B];
		for(int i=0;i<A;i++){
			a[i] = sc.nextInt();
			l[a[i]].add(i);
		}
		for(int i=0;i<B;i++)b[i]=sc.nextInt();
		int[][] e = new int[A][1001];
		int[] h = new int[1001];
		for(int j=1;j<1001;j++)h[j]=l[j].isEmpty()?-1:l[j].get(0);
		for(int i=0;i<A;i++){
			l[a[i]].remove(0);
			for(int j=1;j<1001;j++)e[i][j] = l[j].isEmpty()?-1:l[j].get(0);
		}
		int res = 0;
		for(int i=0;i<B;i++){
			int v = i, p = h[b[i]], k = 0;
			if(p==-1)continue;
			k = 1;
			res = Math.max(res, k);
			v++;
			for(;v<B;v++){
				p = e[p][b[v]];
				if(p==-1)break;
				res = Math.max(res, ++k);
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}