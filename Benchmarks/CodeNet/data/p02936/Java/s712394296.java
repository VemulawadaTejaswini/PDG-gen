import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	long c[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		long a[]= new long[N];
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for (int i=0;i<N-1;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (map.containsKey(x-1)==false) {
				List<Integer> list= new ArrayList<Integer>();
				list.add(y-1);
				map.put(x-1, list);
			} else {
				List<Integer> list = map.get(x-1);
				list.add(y-1);
				map.put(x-1, list);
			}
		}
		for (int i=0;i<Q;i++) {
			int p,x;
			p = sc.nextInt();
			x = sc.nextInt();
			a[p-1]+=x;
		}
		Main main = new Main();
		main.c = new long[N];
		main.c[0] = a[0];
		main.bfs(a,map,0);
		for (int i=0;i<N;i++) {
			System.out.print(main.c[i]+ " ");
		}
	}
	public void bfs(long a[],Map<Integer,List<Integer>> map,int before) {
		if (map.containsKey(before)==true){
			List<Integer> list = map.get(before);
			for (int i =0;i<list.size();i++) {
				c[list.get(i)]+=c[before]+a[list.get(i)];
				bfs(a,map,list.get(i));
			}
		}
	}
}