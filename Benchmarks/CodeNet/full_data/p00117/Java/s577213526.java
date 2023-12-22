import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Dijkstra dk = new Dijkstra(n);
		for (int i = 0;i<m;++i) {
			String[] route = sc.next().split(",");
			dk.addRoute(Integer.parseInt(route[0]),Integer.parseInt(route[1]),Integer.parseInt(route[2]));
			dk.addRoute(Integer.parseInt(route[1]),Integer.parseInt(route[0]),Integer.parseInt(route[3]));
 		}
		String[] str = sc.next().split(",");
		System.out.println(dk.solve(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3])));
		
	}
	
	static class Dijkstra {
		int[][] route;
		int cityNum;
		public Dijkstra (int n) {
			cityNum = n;
			route = new int[cityNum+1][cityNum+1];
			for (int[] r : route) {
				Arrays.fill(r, -1);
			}
		}
		public void addRoute(int from, int to, int cost) {
			route[from][to] = cost;
		}
		public int solve (int start, int goal, int money, int pay) {
			money = money - solve(start,goal);
			money = money - pay;
			money = money - solve(goal,start);
			return money;
		}
		public int solve(int start, int goal) {
			
			PriorityQueue<int[]> q = new PriorityQueue<int[]>(cityNum+1,new Comparator<int[]>() {
				@Override
				public int compare(int[] i1, int[] i2) {
					return i1[1] - i2[1];
				}
			});
			
			boolean[] b = new boolean[cityNum+1];
			Arrays.fill(b,false);
			int[] d = new int[cityNum+1];
			Arrays.fill(d, Integer.MAX_VALUE);
			
			q.add(new int[]{start,0});
			
			while (!q.isEmpty()) {
				int[] r = q.poll();
				int pos = r[0];
				int cost = r[1];
				
				if (pos == goal) {
					return cost;
				}
				b[pos] = true;
				d[pos] = cost;
				
				for (int i=1;i<=cityNum;++i) {
					if (route[pos][i]+cost < d[i] && route[pos][i]!=-1) {
						q.remove(new int[]{i,d[i]});
						d[i] = route[pos][i]+cost;
						q.add(new int[]{i,d[i]});
					}
				}
			}
			
			return -1;
		}
		
	}
}