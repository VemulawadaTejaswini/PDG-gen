import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

// Genericを使った 多分これがよい？
// 実際のソートするときはComparatorで持たせる（下記参照）
class Pair<F, S>{
    public final F first;
    public final S second;

    public Pair (F first, S second) {
        this.first = first;
        this.second = second;
    }
}
class Main{
	public static void main(String args[]){
	    final int INF = Integer.MAX_VALUE/2;
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair<Integer, Integer>>[] edge = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			edge[i] = new ArrayList<Pair<Integer, Integer>>();
		}
		for(int i = 0; i < N - 1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			edge[u - 1].add(new Pair<Integer, Integer>(v - 1, w));
			edge[v - 1].add(new Pair<Integer, Integer>(u - 1, w));
		}
		int[] d = new int[N];
        Arrays.fill(d, -1);
        d[0] = 0;
        Deque<Integer> que = new ArrayDeque<Integer>();
        que.add(0);
        while(!que.isEmpty()){
        	int now = que.pop();
            for(Iterator<Pair<Integer, Integer>> it = edge[now].iterator(); it.hasNext();) {
                Pair<Integer, Integer> next = it.next();
                if(d[next.first] == -1) {
                    d[next.first] = d[now] + next.second;
                    que.add(next.first);
                }
            }
        }

        for(int i = 0;  i < N; i++) {
        	System.out.println((d[i] % 2 == 0) ? 0 : 1);
        }
	}
}