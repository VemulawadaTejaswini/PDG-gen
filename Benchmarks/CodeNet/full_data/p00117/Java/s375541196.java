

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	int Dijkstra(int[][] cost, int s, int g) {

		int[] tc = new int[cost.length];

		Arrays.fill(tc, Integer.MAX_VALUE);

		tc[s] = 0;

		boolean[] visited = new boolean[cost.length];

		for (;!visited[g];) {

			int min = Integer.MAX_VALUE;

			int v = 0;

			for (int i = 0; i < cost.length; i++) {

				if (visited[i])

					continue;

				if (min > tc[i]) {

					v = i;

					min = tc[i];

				}

			}

//			System.out.println(v+" "+tc[v]);

			visited[v] = true;

			for (int k = 0; k < cost.length; k++) {

				if (cost[v][k] != Integer.MAX_VALUE)

					tc[k] = Math.min(tc[v] + cost[v][k], tc[k]);

//				System.out.println(" "+tc[k]);

			}

		}

		return tc[g];

	}



	void run(){

		int n = sc.nextInt();

		int m = sc.nextInt();

		int cost[][] = new int[n][n];

		for(int i =0 ; i < n;i++){

			Arrays.fill(cost[i],Integer.MAX_VALUE);

		}

		for(int i = 0 ; i < m ; i++){

			String buffer = sc.next();

			Scanner in = new Scanner(buffer.replace(',', ' '));

			int a = in.nextInt()-1;

			int b = in.nextInt()-1;

			int c = in.nextInt();

			int d = in.nextInt();

			cost[a][b] = c;

			cost[b][a] = d;

		}

		String buffer = sc.next();

		Scanner in = new Scanner(buffer.replace(',', ' '));

		int s = in.nextInt()-1;

		int g = in.nextInt()-1;

		int zzz = in.nextInt();

		int zz = in.nextInt();

		int r = zzz - zz;

		System.out.println(r-Dijkstra(cost,s,g)-Dijkstra(cost,g,s));

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}